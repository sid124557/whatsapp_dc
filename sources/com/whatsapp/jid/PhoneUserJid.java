package com.whatsapp.jid;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass24P;
import X.AnonymousClass32X;
import X.C162457s7;
import X.C631137z;
import android.os.Parcel;
import android.os.Parcelable;

public final class PhoneUserJid extends UserJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C631137z();
    public static final AnonymousClass32X Companion = new AnonymousClass32X();
    public static final UserJid WHATSAPP_CAPS_SURVEY = AnonymousClass32X.A00("16505361212");
    public final String userString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneUserJid(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.userString = str;
        if (!AnonymousClass32X.A01(this.user)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid user: ");
            throw AnonymousClass24P.A00(AnonymousClass000.A0X(this.user, A0o));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.userString);
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 0;
    }
}
