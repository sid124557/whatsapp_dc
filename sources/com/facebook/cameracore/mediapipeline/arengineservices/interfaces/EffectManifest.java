package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.C192329Jd;

public class EffectManifest {
    public final C192329Jd specifiedCameraFacing;
    public final boolean supportsLandscape;
    public final boolean supportsLongPressGesture;
    public final boolean supportsPanGesture;
    public final boolean supportsPinchGesture;
    public final boolean supportsPortrait;
    public final boolean supportsRawTouchGesture;
    public final boolean supportsRotateGesture;
    public final boolean supportsTapGesture;
    public final boolean usesAssistantCapability;
    public final boolean usesGalleryPicker;
    public final boolean usesGeoanchorCapability;
    public final boolean usesMultiplane;
    public final boolean usesPickerCapability;
    public final boolean usesSceneDepth;
    public final boolean usesSliderCapability;
    public final boolean usesWOLF;
    public final boolean usesWorldTracking;
    public final boolean usesWorldTrackingEnvironmentLight;

    public EffectManifest(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i) {
        C192329Jd r0;
        this.supportsPortrait = z;
        this.supportsLandscape = z2;
        this.supportsTapGesture = z3;
        this.supportsPanGesture = z4;
        this.supportsPinchGesture = z5;
        this.supportsRotateGesture = z6;
        this.supportsLongPressGesture = z7;
        this.supportsRawTouchGesture = z8;
        this.usesWorldTracking = z9;
        this.usesWorldTrackingEnvironmentLight = z10;
        this.usesMultiplane = z11;
        this.usesSceneDepth = z12;
        this.usesWOLF = z13;
        this.usesGalleryPicker = z14;
        this.usesSliderCapability = z15;
        this.usesPickerCapability = z16;
        this.usesAssistantCapability = z17;
        this.usesGeoanchorCapability = z18;
        int i2 = i;
        if (i2 != -1) {
            if (i == 0) {
                r0 = C192329Jd.FRONT;
            } else if (i2 == 1) {
                r0 = C192329Jd.BACK;
            }
            this.specifiedCameraFacing = r0;
        }
        r0 = C192329Jd.UNSPECIFIED;
        this.specifiedCameraFacing = r0;
    }
}
