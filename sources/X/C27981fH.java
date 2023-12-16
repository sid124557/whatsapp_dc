package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1fH  reason: invalid class name and case insensitive filesystem */
public final class C27981fH extends AnonymousClass1fU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C630737v();
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27981fH(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A00 = str;
        int length = str.length();
        if (length < 1 || length > 15) {
            throw AnonymousClass24P.A00(AnonymousClass000.A0X(" - length must be between 1 and 15", AnonymousClass000.A0m("Invalid LID: ", str)));
        }
        if (!C175738Zn.A0Y(str, "0", false)) {
            char[] charArray = str.toCharArray();
            C162457s7.A0D(charArray);
            for (char c : charArray) {
                if (C162457s7.A00(c, 48) < 0 || C162457s7.A00(c, 57) > 0) {
                    throw AnonymousClass24P.A00(AnonymousClass000.A0X(" - must be numeric only", AnonymousClass000.A0m("Invalid LID: ", str)));
                }
            }
            return;
        }
        throw AnonymousClass24P.A00(AnonymousClass000.A0X(" - cannot start with 0", AnonymousClass000.A0m("Invalid LID: ", str)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r3.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C27981fH A00(java.lang.String r3) {
        /*
            if (r3 == 0) goto L_0x0009
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2 = 0
            if (r0 != 0) goto L_0x001e
            X.1fH r1 = X.C383127a.A00(r3)     // Catch:{ all -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r0 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r0)
        L_0x0017:
            boolean r0 = r1 instanceof X.AnonymousClass3Z0
            if (r0 != 0) goto L_0x001c
            r2 = r1
        L_0x001c:
            X.1fH r2 = (X.C27981fH) r2
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27981fH.A00(java.lang.String):X.1fH");
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "lid";
    }

    public int getType() {
        return 18;
    }
}
