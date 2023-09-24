#include <jni.h>
#include <string>

extern "C"

JNIEXPORT jstring JNICALL Java_com_example_ndkcmakedemo_NDKTools_getStringFromNDK(
        JNIEnv *env, jclass clazz) {
    std::string hello = "Hellow World，这是NDK CMake演示的第一行代码";
    return env->NewStringUTF(hello.c_str());
}
