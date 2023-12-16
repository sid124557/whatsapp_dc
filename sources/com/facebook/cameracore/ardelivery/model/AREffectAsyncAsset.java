package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C129586aY;
import X.C153877cA;
import X.C204589pb;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AREffectAsyncAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C204589pb(1);
    public final String mCacheKey;
    public final ARRequestAsset$CompressionMethod mCompressionMethod;
    public final String mId;
    public final boolean mIsLoggingDisabled;
    public final List mStringIdentifiers;
    public final String mUri;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AREffectAsyncAsset)) {
            return false;
        }
        AREffectAsyncAsset aREffectAsyncAsset = (AREffectAsyncAsset) obj;
        return this.mId.equals(aREffectAsyncAsset.mId) && this.mCacheKey.equals(aREffectAsyncAsset.mCacheKey) && this.mStringIdentifiers.equals(aREffectAsyncAsset.mStringIdentifiers) && this.mUri.equals(aREffectAsyncAsset.mUri) && this.mCompressionMethod == aREffectAsyncAsset.mCompressionMethod && this.mIsLoggingDisabled == aREffectAsyncAsset.mIsLoggingDisabled;
    }

    public int getCompressionMethodForNative() {
        return ARRequestAsset$CompressionMethod.toXplatCompressionType(this.mCompressionMethod).mCppValue;
    }

    public String[] getFileNamesForNative() {
        return (String[]) this.mStringIdentifiers.toArray(new String[0]);
    }

    public C129586aY getStringIdentifiers() {
        return C129586aY.copyOf((Collection) this.mStringIdentifiers);
    }

    public int hashCode() {
        return (((((((((this.mId.hashCode() * 31) + this.mCacheKey.hashCode()) * 31) + this.mStringIdentifiers.hashCode()) * 31) + this.mUri.hashCode()) * 31) + this.mCompressionMethod.hashCode()) * 31) + (this.mIsLoggingDisabled ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mCacheKey);
        parcel.writeStringList(this.mStringIdentifiers);
        parcel.writeString(this.mUri);
        parcel.writeSerializable(this.mCompressionMethod);
        parcel.writeByte(this.mIsLoggingDisabled ? (byte) 1 : 0);
    }

    public AREffectAsyncAsset(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.mId = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.mCacheKey = readString2;
        ArrayList A0s = AnonymousClass001.A0s();
        this.mStringIdentifiers = A0s;
        parcel.readStringList(A0s);
        String readString3 = parcel.readString();
        readString3.getClass();
        this.mUri = readString3;
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.mCompressionMethod = (ARRequestAsset$CompressionMethod) readSerializable;
        this.mIsLoggingDisabled = AnonymousClass000.A1S(parcel.readByte());
    }

    public int describeContents() {
        return 0;
    }

    public String getCacheKey() {
        return this.mCacheKey;
    }

    public ARRequestAsset$CompressionMethod getCompressionMethod() {
        return this.mCompressionMethod;
    }

    public String getId() {
        return this.mId;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean isLoggingDisabled() {
        return this.mIsLoggingDisabled;
    }

    public AREffectAsyncAsset(String str, String str2, List list, String str3, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, boolean z) {
        C153877cA.A00(str, "async asset id cannot be null");
        this.mId = str;
        C153877cA.A00(str2, "async asset cache key cannot be null");
        this.mCacheKey = str2;
        this.mStringIdentifiers = list;
        this.mUri = str3;
        this.mCompressionMethod = aRRequestAsset$CompressionMethod;
        this.mIsLoggingDisabled = z;
    }
}
