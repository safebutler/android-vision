package com.google.android.gms.samples.vision.barcodereader

import com.google.android.gms.vision.barcode.Barcode

class DriverLicenseHandler(private val dl: Barcode.DriverLicense) {
    fun Barcode.DriverLicense.gender(): String {
        return when (this.gender) {
            "1" -> "Male"
            "2" -> "Female"
            else -> "Invalid gender"
        }
    }

    fun info(): String {
        return "${dl.firstName}\n${dl.lastName}\n" +
                "${dl.licenseNumber}\n${dl.birthDate}\n${dl.gender()}\n\n" +
                "${dl.addressStreet}\n${dl.addressCity} ${dl.addressState}, ${dl.addressZip}"

    }
}
