SUMMARY = "Minimal RPi5 image: ssh, tools, and my own app"

require recipes-core/images/core-image-base.bb

IMAGE_INSTALL:append = " \
    hello \
    i2c-tools \
    nano \
"

IMAGE_FEATURES += "ssh-server-openssh"

# root with no password. Remove for production.
EXTRA_IMAGE_FEATURES += "debug-tweaks"
