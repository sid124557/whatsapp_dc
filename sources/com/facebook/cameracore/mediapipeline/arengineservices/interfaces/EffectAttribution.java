package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.C204589pb;
import android.os.Parcel;
import android.os.Parcelable;

public class EffectAttribution implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C204589pb(4);
    public final License[] mLicenses;

    public class AttributedAsset implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C204589pb(5);
        public final String mAssetIdentifier;
        public final String mAssetURL;
        public final String mAuthor;
        public final String mNotes;
        public final String mTitle;

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mAssetIdentifier);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mAuthor);
            parcel.writeString(this.mAssetURL);
            parcel.writeString(this.mNotes);
        }

        public AttributedAsset(Parcel parcel) {
            this.mAssetIdentifier = parcel.readString();
            this.mTitle = parcel.readString();
            this.mAuthor = parcel.readString();
            this.mAssetURL = parcel.readString();
            this.mNotes = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public AttributedAsset(String str, String str2, String str3, String str4, String str5) {
            this.mAssetIdentifier = str;
            this.mTitle = str2;
            this.mAuthor = str3;
            this.mAssetURL = str4;
            this.mNotes = str5;
        }
    }

    public class License implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C204589pb(6);
        public final AttributedAsset[] mAttributedAssets;
        public final String mIdentifier;
        public final String mName;
        public final String mUrl;

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mIdentifier);
            parcel.writeString(this.mName);
            parcel.writeString(this.mUrl);
            parcel.writeTypedArray(this.mAttributedAssets, i);
        }

        public License(Parcel parcel) {
            this.mIdentifier = parcel.readString();
            this.mName = parcel.readString();
            this.mUrl = parcel.readString();
            this.mAttributedAssets = (AttributedAsset[]) parcel.createTypedArray(AttributedAsset.CREATOR);
        }

        public int describeContents() {
            return 0;
        }

        public License(String str, String str2, String str3, AttributedAsset[] attributedAssetArr) {
            this.mIdentifier = str;
            this.mName = str2;
            this.mUrl = str3;
            this.mAttributedAssets = attributedAssetArr;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.mLicenses, i);
    }

    public EffectAttribution(Parcel parcel) {
        this.mLicenses = (License[]) parcel.createTypedArray(License.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public EffectAttribution(License[] licenseArr) {
        this.mLicenses = licenseArr;
    }
}
