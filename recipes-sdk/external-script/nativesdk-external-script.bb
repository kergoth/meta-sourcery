SUMMARY = "Adjustments to the SDK environment for an external toolchain."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://external.sh"

inherit nativesdk

do_install () {
    install -d "${D}${SDKPATHNATIVE}/environment-setup.d"
    install -m 0644 -o root -g root "${WORKDIR}/external.sh" "${D}${SDKPATHNATIVE}/environment-setup.d/"
}

FILES_${PN} += "${SDKPATHNATIVE}/environment-setup.d/*"
