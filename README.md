# Id Dog

This project was created for testing my habilities with certain Android technologies.

- Minimum SDK version: API 16
- You can find the .apk [here](https://github.com/cfgdemelo/iddog/blob/master/app/build/outputs/apk/debug/app-debug.apk)

# Important Decisions
- Architecture based on Clean Architecture
- Using Koin as Dependency Injection
- Using Room as Database persistence
- Using Coroutines to process asynchronous work
- Using LiveData on presentation layer
- Layouts based on ConstraintLayout and Material Design

# Other Libs
- Retrofit as the connection interface
- Glide as the tool to load and cache images

# Wishes (future improvements)
- Screen/Activities tests with Espresso 
- Logout function
- [Paging](https://developer.android.com/topic/libraries/architecture/paging) to load small chunks of data at a time
