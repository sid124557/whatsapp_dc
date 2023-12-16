package com.facebook.cameracore.mediapipeline.services.gallerypicker;

public class GalleryPickerServiceContent {
    public final String mFilePath;
    public final boolean mIsPhoto;
    public final int mOrientation;

    public String getFilePath() {
        return this.mFilePath;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean isPhoto() {
        return this.mIsPhoto;
    }
}
