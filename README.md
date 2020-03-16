# ButtonCheckBox
![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=flat)
![LICENSE](https://img.shields.io/github/license/md2m/ButtonCheckBox)

🎉 ButtonCheckBox is tiny Android library to have CheckBox Like Button

# Demo

| Simple Demo  |
| ------------- |
| <img src="https://github.com/Md2m/ButtonCheckBox/blob/master/demo.gif"> |

## Usage

Check out the Sample app, to see how its implemented.

### Gradle
* This library is available on JCenter. To use it, add the following to `build.gradle`
```gradle
dependencies {
    implementation 'com.md2m:buttoncheckbox:0.0.1'
}
```

### XML
```xml
    <com.md2m.buttoncheckbox.ButtonCheckBox
        android:id="@+id/btnCheckBox"
        android:layout_width="100dp"
        android:layout_height="30dp"
        android:layout_centerInParent="true"
        android:gravity="center"
        app:checkedText="uncheck"
        app:uncheckText="check"
        app:checkedColor="#2F36E4"
        app:uncheckColor="#B63131"
        app:topLeftRadius="40"
        app:topRightRadius="40"
        app:bottomLeftRadius="40"
        app:bottomRightRadius="40"
        app:uncheckTextColor="#fff"
        app:checkedTextColor="#000"/>

```

### Animation
```java
 buttonCheckBox.enableAnimation(true);
```

### Activity/Fragment

```java
buttonCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        //Your Code here
    }
});

```
## Contribute

Users are welcome to suggest ideas or feature requests, or report bugs and issues [here](https://github.com/Md2m/ButtonCheckBox/issues)

I am always open to new suggestions and good contributions.

## Contact

Feel free to reach out to me at md2m70@gmail.com

## License:
```
    Copyright 2020 Mohammad Daryanavard

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
```
