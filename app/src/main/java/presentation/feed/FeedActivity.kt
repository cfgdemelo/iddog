package presentation.feed

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.cfgdemelo.iddog.R
import com.cfgdemelo.iddog.presentation.feed.FeedViewModel
import com.cfgdemelo.iddog.presentation.feed.FeedViewModel.Companion.HOUND
import com.cfgdemelo.iddog.presentation.feed.FeedViewModel.Companion.HUSKY
import com.cfgdemelo.iddog.presentation.feed.FeedViewModel.Companion.LABRADOR
import com.cfgdemelo.iddog.presentation.feed.FeedViewModel.Companion.PUG
import com.cfgdemelo.iddog.presentation.feed.adapter.FeedAdapter
import com.cfgdemelo.iddog.presentation.feed.adapter.ItemClick
import com.cfgdemelo.iddog.presentation.utils.fullscreenDialog
import com.cfgdemelo.iddog.presentation.utils.toast
import kotlinx.android.synthetic.main.activity_feed.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class FeedActivity : AppCompatActivity(), ItemClick {

    private val viewModel: FeedViewModel by viewModel()
    private lateinit var glide: RequestManager
    private lateinit var adapter: FeedAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        configScreenBehavior()
        configViewModelObservers()
        configRecyclerView()
    }

    override fun click(url: String) {
        val dialogId = R.layout.dialog_image
        fullscreenDialog(dialogId).apply {
            findViewById<ImageView>(R.id.ivDetailImage)?.let {
                glide.load(url).diskCacheStrategy(DiskCacheStrategy.ALL).onlyRetrieveFromCache(true)
                    .into(it)
            }

            findViewById<ImageButton>(R.id.ibClose)?.let {
                it.setOnClickListener {
                    this.dismiss()
                }
            }
        }
    }

    private fun configScreenBehavior() {
        glide = Glide.with(this)

        bnvBottomView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.husky -> viewModel.getNewFeed(HUSKY)
                R.id.labrador -> viewModel.getNewFeed(LABRADOR)
                R.id.hound -> viewModel.getNewFeed(HOUND)
                R.id.pug -> viewModel.getNewFeed(PUG)
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    private fun configViewModelObservers() {
        viewModel.feed.observe(this, Observer {
            adapter.refresh(it.list)
        })

        viewModel.error.observe(this, Observer {
            toast(it)
        })
    }

    private fun configRecyclerView() {
        adapter = FeedAdapter(glide, this)
        rvPhotos?.let {
            it.layoutManager = GridLayoutManager(this, 2).apply {
                this.stackFromEnd = false
            }
            it.setHasFixedSize(false)
            it.adapter = adapter
        }
    }

    companion object {
        fun newInstance(context: Context): Intent = Intent(context, FeedActivity::class.java)
    }
}
