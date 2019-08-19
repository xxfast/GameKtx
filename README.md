# GameKtx
[![Build Status](https://travis-ci.com/xxfast/GameKtx.svg?branch=master)](https://travis-ci.com/xxfast/GameKtx)

Sample libKtx game targeting desktop, ios and android

Sample project was made using the [libgdx builder](https://libgdx.badlogicgames.com/download.html), then optimised, cleaned up and sprinkled in some [libktx](https://libktx.github.io/) 

## Module Structure

* `GameKt`
    * `/android` - Should only be game launcher, and android target specific logic
    * `/desktop` - Should only be game launcher, and desktop target specific logic
    * `/ios` - Should only be game launcher, and desktop target specific logic
        * This module is not tested - and might be deprecated because metal

