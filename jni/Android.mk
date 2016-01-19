LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := Amazing
LOCAL_SRC_FILES := Amazing.cpp

include $(BUILD_SHARED_LIBRARY)
