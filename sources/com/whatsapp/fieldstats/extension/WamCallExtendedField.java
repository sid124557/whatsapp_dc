package com.whatsapp.fieldstats.extension;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.C162457s7;
import X.C165377wy;
import X.C18260x0;
import android.os.Parcel;
import android.os.Parcelable;

public final class WamCallExtendedField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165377wy();
    public final int fieldId;
    public final String fieldType;
    public final Object fieldValue;

    public WamCallExtendedField(int i, String str, Object obj) {
        C162457s7.A0J(str, 2);
        this.fieldId = i;
        this.fieldType = str;
        this.fieldValue = obj;
    }

    public final WamCallExtendedField copy(int i, String str, Object obj) {
        C162457s7.A0J(str, 1);
        return new WamCallExtendedField(i, str, obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WamCallExtendedField) {
                WamCallExtendedField wamCallExtendedField = (WamCallExtendedField) obj;
                if (this.fieldId != wamCallExtendedField.fieldId || !C162457s7.A0P(this.fieldType, wamCallExtendedField.fieldType) || !C162457s7.A0P(this.fieldValue, wamCallExtendedField.fieldValue)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeInt(this.fieldId);
        parcel.writeString(this.fieldType);
        parcel.writeValue(this.fieldValue);
    }

    public static /* synthetic */ WamCallExtendedField copy$default(WamCallExtendedField wamCallExtendedField, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = wamCallExtendedField.fieldId;
        }
        if ((i2 & 2) != 0) {
            str = wamCallExtendedField.fieldType;
        }
        if ((i2 & 4) != 0) {
            obj = wamCallExtendedField.fieldValue;
        }
        return wamCallExtendedField.copy(i, str, obj);
    }

    public final int component1() {
        return this.fieldId;
    }

    public final String component2() {
        return this.fieldType;
    }

    public final Object component3() {
        return this.fieldValue;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.fieldType, this.fieldId * 31) + AnonymousClass000.A07(this.fieldValue);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamCallExtendedField(fieldId=");
        A0o.append(this.fieldId);
        A0o.append(", fieldType=");
        A0o.append(this.fieldType);
        A0o.append(", fieldValue=");
        return C18260x0.A04(this.fieldValue, A0o);
    }
}
