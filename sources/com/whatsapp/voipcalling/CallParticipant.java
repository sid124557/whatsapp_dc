package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4CY;
import X.AnonymousClass4IW;
import X.C18280x3;
import X.C626936e;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

public final class CallParticipant implements Parcelable, AnonymousClass4CY {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(36);
    public final UserJid jid;
    public final String state;

    public boolean isCallConnected() {
        return "connected".equals(this.state);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.jid, i);
        parcel.writeString(this.state);
    }

    public CallParticipant(Parcel parcel) {
        Parcelable A0C = C18280x3.A0C(parcel, UserJid.class);
        C626936e.A06(A0C);
        this.jid = (UserJid) A0C;
        this.state = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public UserJid getCallUserJid() {
        return this.jid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallParticipant{jid=");
        A0o.append(this.jid);
        A0o.append(", state=");
        A0o.append(this.state);
        return AnonymousClass000.A0d(A0o);
    }

    public CallParticipant(UserJid userJid, String str) {
        this.jid = userJid;
        this.state = str;
    }
}
