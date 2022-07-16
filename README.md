# **SHIRASERU** 

BADGES:

### **Actual** library version is [![](https://www.jitpack.io/v/hardcoderdev/shiraseru.svg)](https://www.jitpack.io/#hardcoderdev/shiraseru) <br><br>


# **TOC (Table of Contents):**

* 1. [**What is this library for?**](#LibraryPreview)
* 2. [**What I should use?**](#SeparationConcept)
* 3. [**Get started**](#GetStarted)
* 4. [**Toasts. Work with core**](#ToastsCore)
* 5. [**Snackbars. Work with core**](#SnackbarsCore)
* 6. [**Toasts. Work with built in**](#ToastsBuiltIn)
* 7. [**Snackbars. Work with built in**](#SnackbarsBuiltIn)
* 8. [**DSL. Preface**](#DSLPreface)
* 9. [**DSL. Toasts Core**](#ToastsCoreDSL)
* 10. [**DSL. Toasts Built In**](#ToastsBuiltInDSL)
* 11. [**DSL. Snackbars Core**](#SnackbarsCoreDSL)
* 12. [**DSL. Snackbars Built In**](#SnackbarsBuiltIn)
* 13. [**Where I make it try out?**](#Samples)
* 14. [**Support creator**](#SupportCreator)


# 1. <a name='LibraryPreview?'></a>**What is this library for?** 

> ##  This library allows you to create **the most customizable** toasts and snackbars 

<br><br>

# 2. <a name='SeparationConcept'></a>**What I should use?** 
> ## This library is divided into 8 modules: 

<br>

## **Toast modules**:
> # 1) Toasts-core
> # 2) Toasts-built-in
> # 3) Toasts-core-dsl
> # 4) Toasts-built-in-dsl

## **Snackbar modules**:
> # 1) Snackbar-core
> # 2) Snackbar-built-in
> # 3) Snackbar-core-dsl
> # 4) Snackbar-built-in-dsl

## If you love ***DSL*** and are going to use this library along with this language, then you can not include core and built-in modules, instead use only modules with _**DSL** postfix_.  

<br><br>

# 3. <a name='GetStarted'></a>**Get started**

## In order to start using the library, you need to ***add a link to the JitPack*** in the *build.gradle* file of the _project_ level:

```
allprojects {
    repositories {
        ...
        maven { url 'https://www.jitpack.io' }
    }
}
```

## You can then include the required modules. For convenience, *all available to use modules* are presented below:
<br>

## **Example on Groovy**:

```
// Default variant
implementation("com.github.hardcoderdev.shiraseru:shiraseru-toasts-core:$actual_version_here")
implementation("com.github.hardcoderdev.shiraseru:shiraseru-toasts-built-in:$actual_version_here")
implementation("com.github.hardcoderdev.shiraseru:shiraseru-snackbars-core:$actual_version_here")
implementation("com.github.hardcoderdev.shiraseru:shiraseru-snackbars-built-in:$actual_version_here")

// Add DSL
implementation("com.github.hardcoderdev.shiraseru:shiraseru-toasts-dsl:$actual_version_here")
implementation("com.github.hardcoderdev.shiraseru:shiraseru-toasts-built-in-dsl:$actual_version_here")
implementation("com.github.hardcoderdev.shiraseru:shiraseru-snackbars-dsl:$actual_version_here")
implementation("com.github.hardcoderdev.shiraseru:shiraseru-snackbars-built-in-dsl:$actual_version_here")
```
<br>

> ## The current version can always be viewed in the **badges** section at the very top of the readme.

<br>

# 4. <a name='ToastsCore'></a>**Toasts. Work with core**

## In order to **set up** your toast, you will need to call an **extension function on a context** called ***toaster***, and pass a few parameters there: a **message** and a toast **configuration**.

<br>

## The toast configuration consists of a **main config**, and a set of **small configs**.

## Here **all** configurations for toast:

<br>

> ## 1) **Gravity Config** - where locate toast and icon. Also we can add x and y coordinates offset.
> ## 2) **Icon Config** - if we need icon, use this. Consists of icon, padding and tint.
> ## 3) **Typography Config** - describes typeface, text size and text color of toast.
> ## 4) **Shape Config** - config which describes shape of toast. Background and tint.
> ## 5) **Toaster Config** - main config consisting of other subconfigs.

<br>


```
toaster(
     message = "Example core...",
        config = ToasterConfig(
                isNeedToShowIcon = true,
                showDuration = ToasterDuration.SHORT,
            shapeConfig = ShapeConfig(
                    background = Background(ResourcesCompat.getDrawable(resources, R.drawable.shape_16, theme)),
                    tint = BackgroundTint(ResourcesCompat.getColor(resources, R.color.black, theme))
                ),
            typographyConfig = TypographyConfig(
                    textColor = TextColor(ResourcesCompat.getColor(resources, R.color.white, theme)),
                    textSize = TextSize(22),
                    textGravity = ToasterGravity.CENTER
            ),
            iconConfig = IconConfig(
                    drawable = Icon(ResourcesCompat.getDrawable(resources, R.drawable.ic_cart, theme)),
                    tint = IconTint(Color.WHITE),
                    padding = IconPadding(16)
            ),
            gravityConfig = GravityConfig(
                    iconGravity = IconGravity.END,
                    toasterGravity = ToasterGravity.BOTTOM,
                    xOffset = XOffsetValue(0),
                    yOffset = YOffsetValue(64)
            )
        )
    )
```

> ## This will produce that toast:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/toaster_core_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/toaster_core_example.png" width="100%" height="60%" />



## As you can see, here we have used all configurations. To pass parameters, _if we do not use dsl_, then we **use data classes**, inside which we put a value, **if this value = a link to a resource**, then, as shown in the example, you yourself must **take care of getting the value from the resources**.
 
<br>

## In addition to the configuration, we also see *3 parameters*: the **message** itself, a _boolean flag_ to **show** or **hide** the icon, and the **duration** of the toast.
 
<br>

> # **Attention**! Using this library, it is far from necessary to use **all** configurations and **all** parameters, all configs have **default parameters**.

<br>


# 5. <a name='SnackbarsCore'></a>**Snackbars. Work with core** 

<br>

## To set up a **snackbar**, you need to call a function - an **extension** on the **View**, called **snacker**:

<br>

```

binding.root.snacker(
            config = SnackerConfig(
                delimiterConfig = DelimiterConfig(
                    color = DelimiterColor(Color.WHITE),
                    width = DelimiterWidth(16),
                    shape = DelimiterShape(ResourcesCompat.getDrawable(resources, R.drawable.shape_16, theme))
                ),
                iconConfig = IconConfig(
                    drawable = Icon(ResourcesCompat.getDrawable(resources, R.drawable.ic_cart, theme)),
                    tint = IconTint(Color.WHITE),
                    padding = IconPadding(16)
                ),
                gravityConfig = GravityConfig(
                    iconGravity = IconGravity.END,
                    toasterGravity = ToasterGravity.CENTER_HORIZONTAL,
                    xOffset = XOffsetValue(0),
                    yOffset = YOffsetValue(0)
                ),
                typographyConfig = TypographyConfig(
                    messageGravity = ToasterGravity.CENTER,
                    messageTypeface = MessageTypeface(Typeface.DEFAULT_BOLD),
                    actionTypeface = ActionTypeface(Typeface.MONOSPACE),
                    messageTextSize = MessageTextSize(18),
                    actionTextSize = ActionTextSize(16),
                    messageTextColor = MessageTextColor(Color.WHITE),
                    actionTextColor = ActionTextColor(Color.WHITE)
                ),
                extraImageConfig = ExtraImageConfig(
                    image = ExtraImage(ResourcesCompat.getDrawable(resources, R.drawable.ic_read_more, theme)),
                    scaleType = ImageView.ScaleType.CENTER
                ),
                shapeConfig = ShapeConfig(
                    background = Background(ResourcesCompat.getDrawable(resources, R.drawable.shape_16, theme)),
                    tint = BackgroundTint(Color.BLACK)
                ),
                visibilityConfig = VisibilityConfig(
                    isNeedToShowIcon = IsNeedToShowIcon(true),
                    isNeedToShowAction = IsNeedToShowAction(true),
                    isNeedToShowDelimiter = IsNeedToShowDelimiter(true),
                    isNeedToShowExtraPicture = IsNeedToShowExtraPicture(true)
                ),
                sizingConfig = SizingConfig(
                    marginBottom = MarginBottom(64),
                    marginStart = MarginStart(64),
                    marginEnd = MarginEnd(64)
                ),
                showDuration = SnackerDuration.LONG
            ),
            message = "Snacker Example",
            actionMessage = "Undo",
            action = {
                Log.i("LOG_TAG", "Snackbar action was called!")
            }
    )

```

> ## This will produce that snackbar:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_core_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_core_example.png" width="100%" height="60%" />

<br>


## Let's look at the **example above**. All configurations are also used here. Some are similar to toast, I have already explained them, and now _let's analyze the rest_:

<br>

> ## 1) **Delimiter Config** - responsible for the configuration of the **delimiter**, this is a **small stick between the icon (if any) and the action**. I don't think it's necessary to explain to you what an action in a snackbar is. Here we can **adjust the color, width and shape of the divider**.

> ## 2) **Extra Image Config** - if you need an **extra image** at the beginning of the snackbar, use this config, where you can **specify the image and its Scale Type**.

> ## 3) **Visibility Config** - **don't want** an **icon**, **separator**, **action** or **additional picture** in the snackbar? this config will **help** you.

> ## 4) **Sizing Config** - allows you to set the **margins** from the _bottom of the screen_, _left_ and _right_.

<br>

## In addition to the configs in the **main config (Snacker Config)**, you _must also pass a few parameters_.

## **Mandatory parameters** are the **message and duration** of the snackbar, **optional** are the **action message** and the **action** itself.

<br>

# 6. <a name='ToastsBuiltIn'></a>**Toasts. Work with built in**

## As mentioned above, **built - in** is a kind of **add-on** that allows you to use toasts and snack bars **"out of the box"** _without spending time_ customizing and writing them **manually**.

<br>

> ## When including any **built-in** module, you don't have to include the **core** module, that is: if you include **toasts-built-in**, you don't need to include **toasts-core**.

<br>

## Each **built-in** _toast_ and _snackbar_ has **states**, there are **4** in total:

<br>

> ## 1) **ERROR**

> ## 2) **WARNING**

> ## 3) **INFO**

> ## 4) **SUCCESS**

<br>

## Let's analyze the **built-in** toast **example**:

<br>

```
builtInToaster(
    message = "Example built-in...",
        config = BuiltInToasterConfig(
                state = BuiltInToasterState.ERROR,
                isNeedToShowIcon = BuiltInIsNeedToShowIcon(true),
                textColor = BuiltInTextColor(Color.WHITE),
                iconTint = BuiltInIconTint(Color.WHITE),
                iconGravity = IconGravity.END
        )
    )
```

> ## This will produce that toast:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/toast_built_in_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/toast_built_in_example.png" width="100%" height="60%" />

<br>

## As we can see, in order to **use** such a toast, we need to _call an extension function on the context_ called **builtInToaster**. It takes 2 **parameters**:

## **Message** and **config**.

<br>

## The config accepts **few** parameters: the **state** itself, _we analyzed them above_, whether to **show the icon or not**, **text color**, **icon color**, **icon gravity**.

<br>

# 7. <a name='SnackbarsBuiltIn'></a>**Snackbars. Work with built in**

## Working with snackbars **out of the box** is almost the **same** as working with **toast** **out of the box**. To do this, you need to **call a function(()) - an extension on the View, called **builtInSnacker**:

<br>


```
root.builtInSnacker(
        config = BuiltInSnackerConfig(
                state = BuiltInSnackerState.WARNING,
                isNeedToShowAction = BuiltInIsNeedToShowAction(false),
                isNeedToShowIcon = BuiltInIsNeedToShowIcon(false),
                messageTextColor = BuiltInMessageTextColor(Color.BLACK),
                iconGravity = IconGravity.END,
                isFloating = IsFloating(false)
        ),
        message = "Example Snackbar"
    )
```

> ## This will produce that snackbar:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_built_in_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_built_in_example.png" width="100%" height="60%" />

## Of the **new** parameters here: **isNeedToShowAction**, which is **responsible** for **hiding or showing** the **action**, and **isFloating** - _if it is set to **true**_, the snackbar will have **margins** from the _bottom, left and right_, if the **isFloating** parameter is set to **false** - the snackbar **will be pressed close to the screen**.

<br>

# 8. <a name='DSLPreface'></a>**DSL. Preface**

## Now let's deal with the **DSL approach**. If you're going to use the DSL, it means that you're **familiar** with **infix functions**, **context control**, **operator overloading**, **lambdas with receivers**, and **other** things.

<br>

> ## This library allows you to build **both customizable toasts and snackbars (core)** and **built-in (out of the box)** in the form of a ***DSL***.

<br>

# 9. <a name='ToastsCoreDSL'></a>**DSL. Toasts Core**

## Let's take a look at **how to work** with **custom toast (core)** using ***DSL***:

```
toaster {
    message = "Successful purchase!"
    config {
        shape {
            background byResource R.drawable.shape_16
            tint byResource R.color.black
        }

        icon {
            drawable byResource R.drawable.ic_cart
            tint byResource R.color.white
            padding byValue 22
        }

        typography {
            typeface byEnum Typeface.DEFAULT
            textColorResourceId byResource R.color.white
            textGravity byEnum ToasterGravity.CENTER
            textSize byValue 20
        }

        gravity {
            icon byEnum IconGravity.END
            toaster byEnum ToasterGravity.BOTTOM
            xOffset byValue 0
            yOffset byValue 64
        }
    }
}
```

> ## This will produce that toast:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/toast_core_dsl_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/toast_core_dsl_example.png" width="100%" height="60%" />


> ## Everything here is exactly the **same** as in **core toasts**, only in ***DSL style***.

<br>

## **Notice** the use of **infix functions**:
<br>

## if you want to pass the **value** **directly** (as a **drawable**, **text size** or **padding**) you can use the **byValue** function, if you want to use the **resources** of your application then use the **byResource** function (***Note that you don't need to pull the resources yourself, the library does it for you***) 

<br>

## In places where you need to pass a **value as an Enum class**, you can use the **byEnum** function.

<br>

# 10. <a name='ToastsBuiltInDSL'></a>**DSL. Toasts Built In**

> ## DSL for **Built-in toast**:

<br>

```
builtInToaster {
    message = "Wow! Msg, yeah."
    config {
        state byEnum BuiltInToasterState.SUCCESS
        iconGravity byEnum IconGravity.END
        isNeedToShowIcon byValue true
        iconTint byResource R.color.white
        textColor byValue Color.WHITE
    }
}
```

> ## This will produce that toast:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/toast_built_in_dsl_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/toast_built_in_dsl_example.png" width="100%" height="60%" />

# 11. <a name='SnackbarsCoreDSL'></a>**DSL. Snackbars Core**

## Nothing out of the ordinary here either, the **lambda for action** here is called ***doWhenActionPressed***

<br>

```
binding.root.snacker {
    message = "My Snackbar!"
    actionMessage = "Undo"
    doWhenActionPressed = {
        Log.i("LOG_TAG", "Snackbar action was called!")
    }

    config {
        shape {
            background byResource R.drawable.shape_16
            tint byValue Color.BLACK
        }

        extraImage {
            extraImage byValue ResourcesCompat.getDrawable(resources, R.drawable.ic_cart, theme)
            scaleType byEnum ImageView.ScaleType.CENTER_CROP
        }

        visibility {
            isNeedToShowAction byValue true
            isNeedToShowIcon byValue true
            isNeedToShowExtraPicture byValue true
            isNeedToShowDelimiter byValue true
        }

        typography {
            messageTextColor byValue Color.WHITE
            actionTextColor byValue Color.WHITE
            messageTextSize byValue 20
            actionTextSize byValue 18
            messageTypeface byEnum Typeface.DEFAULT_BOLD
            actionTypeface byEnum Typeface.MONOSPACE
        }

        delimiter {
            color byResource R.color.white
            shape byResource R.drawable.shape_16
            width byValue 8
        }

        sizing {
            marginBottom byValue 64
            marginStart byValue 64
            marginEnd byValue 64
        }
    }
}
```

> ## This will produce that snackbar:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_core_dsl_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_core_dsl_example.png" width="100%" height="60%" />

> ## You can find out this example in **samples**

<br>

# 12. <a name='SnackbarsBuiltIn'></a>**DSL. Snackbars Built In**


# Here example of a **Built In Snackbar**:

```
root.builtInSnacker {
    config {
        state byEnum BuiltInSnackerState.INFO
        isNeedToShowIcon byValue true
        iconTint byResource R.color.white
        iconPadding byValue 20
        messageTextColor byResource R.color.white
        showDuration byEnum SnackerDuration.LONG
        iconGravity byEnum IconGravity.START
        isFloating byValue true
        message = "Snacker Example"
        action = "OK"
        doWhenActionPressed = {
            Log.i("LOG_TAG", "Snackbar action was called!")
        }
    }
}
```


> ## This will produce that snackbar:

<br>

<img src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_built_in_dsl_example.png" data-canonical-src="https://github.com/hardcoderdev/shiraseru/assets/snackbar_built_in_dsl_example.png" width="100%" height="60%" />

<br>

> ## Nothing new, the same **built-in snackbar** in ***DSL style***. 

<br>

# 13. <a name='Samples'></a>**Where I make it try out?**

> # You can try out all the functionality provided in the library by *cloning this repository* to yourself. I made a small application where you can **try everything** and play around with the values, trying out all the options. The code related to this is in the **Samples** module of this project.

<br>

# 14. <a name='SupportCreator'></a>**Support creator**

## If you think this library is **convenient enough, practical and solves your problem**, you can **support** me here: 
<br>
<a href="https://www.buymeacoffee.com/hardcoderdev" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" height="41" width="174"></a>
