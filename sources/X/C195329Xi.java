package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: X.9Xi  reason: invalid class name and case insensitive filesystem */
public class C195329Xi implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C204589pb(12);
    public final C195309Xd A00;
    public final Integer A01;
    public final String A02;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[Catch:{ 24Y -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b A[Catch:{ 24Y -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091 A[Catch:{ 24Y -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C195329Xi A00(X.AnonymousClass36K r9) {
        /*
            java.lang.String r5 = "kyc-rejection-code"
            r2 = 0
            java.lang.String r0 = "kyc-state"
            java.lang.String r4 = r9.A0r(r0, r2)     // Catch:{ 24Y -> 0x0094 }
            java.lang.String r0 = "kyc-actions-requested"
            X.36K r3 = r9.A0l(r0)     // Catch:{ 24Y -> 0x0094 }
            if (r3 == 0) goto L_0x0055
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ 24Y -> 0x0094 }
            java.lang.String r0 = "obligation"
            java.lang.String r1 = r3.A0q(r0)     // Catch:{ 24Y -> 0x0094 }
            java.lang.String r0 = "upload-document"
            java.util.Iterator r8 = X.AnonymousClass36K.A0M(r3, r0)     // Catch:{ 24Y -> 0x0094 }
        L_0x0021:
            boolean r0 = r8.hasNext()     // Catch:{ 24Y -> 0x0094 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r7 = r8.next()     // Catch:{ 24Y -> 0x0094 }
            X.36K r7 = (X.AnonymousClass36K) r7     // Catch:{ 24Y -> 0x0094 }
            java.lang.String r0 = "type"
            java.lang.String r7 = r7.A0q(r0)     // Catch:{ 24Y -> 0x0094 }
            java.lang.String r0 = "PROOF_OF_IDENTITY"
            boolean r0 = r0.equals(r7)     // Catch:{ 24Y -> 0x0094 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "UPLOAD_DOC_IDENTITY"
        L_0x003d:
            r6.add(r0)     // Catch:{ 24Y -> 0x0094 }
            goto L_0x0021
        L_0x0041:
            java.lang.String r0 = "PROOF_OF_ADDRESS"
            boolean r0 = r0.equals(r7)     // Catch:{ 24Y -> 0x0094 }
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "UPLOAD_DOC_ADDRESS"
            goto L_0x003d
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0094 }
            java.lang.String r0 = "PAY: KycActionsRequested/fromProtocolTreeNode non-supported action type: "
            X.C18260x0.A0r(r0, r7, r1)     // Catch:{ 24Y -> 0x0094 }
        L_0x0055:
            r3 = r2
            goto L_0x0076
        L_0x0057:
            java.lang.String r0 = "verify-card"
            X.36K r0 = r3.A0l(r0)     // Catch:{ 24Y -> 0x0094 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "VERIFY_CARD"
            r6.add(r0)     // Catch:{ 24Y -> 0x0094 }
        L_0x0064:
            java.lang.String r0 = "provide-ssn-last4"
            X.36K r0 = r3.A0l(r0)     // Catch:{ 24Y -> 0x0094 }
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "PROVIDE_SSN_LAST4"
            r6.add(r0)     // Catch:{ 24Y -> 0x0094 }
        L_0x0071:
            X.9Xd r3 = new X.9Xd     // Catch:{ 24Y -> 0x0094 }
            r3.<init>(r1, r6)     // Catch:{ 24Y -> 0x0094 }
        L_0x0076:
            java.lang.String r0 = r9.A0r(r5, r2)     // Catch:{ 24Y -> 0x0094 }
            if (r0 == 0) goto L_0x0091
            r0 = 0
            int r0 = r9.A0b(r5, r0)     // Catch:{ 24Y -> 0x0094 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 24Y -> 0x0094 }
        L_0x0085:
            boolean r0 = X.C107575bX.A0F(r4)     // Catch:{ 24Y -> 0x0094 }
            if (r0 != 0) goto L_0x009a
            X.9Xi r0 = new X.9Xi     // Catch:{ 24Y -> 0x0094 }
            r0.<init>(r3, r1, r4)     // Catch:{ 24Y -> 0x0094 }
            goto L_0x0093
        L_0x0091:
            r1 = r2
            goto L_0x0085
        L_0x0093:
            return r0
        L_0x0094:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentKycInfo/fromProtocolTreeNode "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195329Xi.A00(X.36K):X.9Xi");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A02);
        Integer num = this.A01;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.A00, i);
    }

    public C195329Xi(Parcel parcel) {
        Integer valueOf;
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.A02 = readString;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(readInt);
        }
        this.A01 = valueOf;
        this.A00 = (C195309Xd) C18280x3.A0C(parcel, C195309Xd.class);
    }

    public int describeContents() {
        return 0;
    }

    public C195329Xi(C195309Xd r1, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = r1;
    }
}
