// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {}

plugins {
    alias(libs.plugins.androidApplication) apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
}
