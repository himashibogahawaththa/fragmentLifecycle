# fragmentLifecycle
![Screenshot (248)](https://github.com/himashibogahawaththa/fragmentLifecycle/assets/87941964/7d1cebce-ae2f-4645-a2e5-01a4399e8dcf)
![Screenshot (249)](https://github.com/himashibogahawaththa/fragmentLifecycle/assets/87941964/46e7067a-6558-4ccb-a9ce-d9d69a68ccca)
![Screenshot (250)](https://github.com/himashibogahawaththa/fragmentLifecycle/assets/87941964/fae08533-b0df-4e22-902f-5725051c1c48)

This project serves as an implementation of the Fragment lifecycle in an Android application. Fragments are modular components that represent a portion of the user interface and can be combined to create a flexible and dynamic UI design. Understanding the Fragment lifecycle is crucial for managing the state and behavior of fragments within an app.

# Fragment Lifecycle Overview
The Fragment lifecycle consists of the following key states:

onAttach(): Called when the fragment is associated with its hosting activity. This is where the fragment initializes its connection to the activity.

onCreate(): Invoked when the fragment is being created. It is used for initializing essential components, such as variables, UI elements, and setting up event listeners.

onCreateView(): Called when it's time for the fragment to draw its user interface for the first time. In this state, the fragment inflates its layout and initializes UI elements.

onActivityCreated(): This state indicates that the activity's onCreate() method has completed execution. It provides an opportunity for the fragment to access the activity and its resources.

onStart(): The fragment becomes visible to the user. It prepares the fragment for user interaction and ensures that it is ready to be displayed on the screen.

onResume(): The fragment enters the resumed state and comes to the foreground. It is the point where the fragment is active and ready for user interaction.

onPause(): This state indicates that the fragment is no longer in focus and is partially visible. It occurs when another fragment or activity comes into the foreground.

onStop(): The fragment is no longer visible to the user and is considered to be in the background. It may be destroyed or brought back to the foreground, depending on the app's lifecycle.

onDestroyView(): Called when the fragment's view is being removed. It allows for releasing resources and cleaning up the UI components.

onDestroy(): This method is called when the fragment is about to be destroyed. It provides an opportunity to perform any necessary cleanup before the fragment is removed.

onDetach(): Called when the fragment is being disassociated from its hosting activity. It signifies the end of the fragment's lifecycle.
