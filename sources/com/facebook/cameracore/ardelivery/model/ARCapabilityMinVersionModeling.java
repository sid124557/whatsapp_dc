package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1447372t;
import X.C204589pb;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;

public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C204589pb(0);
    public static final long serialVersionUID = 0;
    public VersionedCapability mCapability;
    public int mMinVersion;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
            if (!C1447372t.A00(this.mCapability, aRCapabilityMinVersionModeling.mCapability) || !C1447372t.A00(Integer.valueOf(this.mMinVersion), Integer.valueOf(aRCapabilityMinVersionModeling.mMinVersion))) {
                return false;
            }
        }
        return true;
    }

    public int getCapabilityXplatValue() {
        return this.mCapability.getXplatValue();
    }

    public boolean isCapabilityBodyTracking() {
        return C1447372t.A00(this.mCapability, VersionedCapability.BodyTracking);
    }

    public boolean isCapabilityFacetracker() {
        return C1447372t.A00(this.mCapability, VersionedCapability.Facetracker);
    }

    public boolean isCapabilityGazeCorrection() {
        return C1447372t.A00(this.mCapability, VersionedCapability.GazeCorrection);
    }

    public boolean isCapabilityHairSegmentation() {
        return C1447372t.A00(this.mCapability, VersionedCapability.HairSegmentation);
    }

    public boolean isCapabilityHandTracking() {
        return C1447372t.A00(this.mCapability, VersionedCapability.HandTracker);
    }

    public boolean isCapabilitySegmentation() {
        return C1447372t.A00(this.mCapability, VersionedCapability.Segmentation);
    }

    public boolean isCapabilityTargetRecognition() {
        return C1447372t.A00(this.mCapability, VersionedCapability.TargetRecognition);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCapability.ordinal());
        parcel.writeInt(this.mMinVersion);
    }

    public ARCapabilityMinVersionModeling(int i, int i2) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        fromXplatValue.getClass();
        this.mCapability = fromXplatValue;
        this.mMinVersion = i2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.mCapability;
        A0M[1] = Integer.valueOf(this.mMinVersion);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("capability: ");
        A0o.append(this.mCapability);
        A0o.append(", minVersion:");
        return AnonymousClass000.A0h(A0o, this.mMinVersion);
    }

    public int describeContents() {
        return 0;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.mCapability = VersionedCapability.values()[parcel.readInt()];
        this.mMinVersion = parcel.readInt();
    }

    public /* synthetic */ ARCapabilityMinVersionModeling(Parcel parcel, C204589pb r2) {
        this(parcel);
    }

    public ARCapabilityMinVersionModeling(VersionedCapability versionedCapability, int i) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
    }

    public ARCapabilityMinVersionModeling() {
    }
}
