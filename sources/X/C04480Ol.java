package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Ol  reason: invalid class name and case insensitive filesystem */
public final class C04480Ol {
    public int A00 = -1;
    public int A01;
    public int A02 = 8388613;
    public int A03;
    public int A04 = 0;
    public int A05 = 1;
    public int A06 = 80;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C = AnonymousClass001.A0s();
    public ArrayList A0D = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ Object clone() {
        C04480Ol r1 = new C04480Ol();
        r1.A0C = AnonymousClass002.A0J(this.A0C);
        r1.A05 = this.A05;
        r1.A08 = this.A08;
        r1.A0D = AnonymousClass002.A0J(this.A0D);
        r1.A09 = this.A09;
        r1.A01 = this.A01;
        r1.A02 = this.A02;
        r1.A00 = this.A00;
        r1.A04 = this.A04;
        r1.A03 = this.A03;
        r1.A06 = this.A06;
        r1.A07 = this.A07;
        r1.A0B = this.A0B;
        r1.A0A = this.A0A;
        return r1;
    }

    public void A00(C05610Ue r11) {
        int i;
        Notification.Action.Builder A002;
        Icon A082;
        Bundle A083 = AnonymousClass002.A08();
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList A0I = AnonymousClass002.A0I(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C05480Tm r7 = (C05480Tm) it.next();
                int i2 = Build.VERSION.SDK_INT;
                IconCompat A003 = r7.A00();
                if (i2 >= 23) {
                    if (A003 == null) {
                        A082 = null;
                    } else {
                        A082 = A003.A08();
                    }
                    A002 = AnonymousClass0HO.A00(r7.A01, A082, r7.A03);
                } else {
                    if (A003 == null || A003.A05() != 2) {
                        i = 0;
                    } else {
                        i = A003.A04();
                    }
                    A002 = AnonymousClass0WU.A00(r7.A01, r7.A03, i);
                }
                Bundle bundle = new Bundle(r7.A07);
                boolean z = r7.A04;
                bundle.putBoolean("android.support.allowGeneratedReplies", z);
                if (i2 >= 24) {
                    AnonymousClass0HP.A00(A002, z);
                    if (i2 >= 31) {
                        AnonymousClass0HQ.A00(A002, false);
                    }
                }
                AnonymousClass0WU.A03(A002, bundle);
                C03950Me[] r72 = r7.A09;
                if (r72 != null) {
                    int length = r72.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        remoteInputArr[i3] = AnonymousClass0RM.A00(r72[i3]);
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        AnonymousClass0WU.A02(A002, remoteInputArr[i4]);
                    }
                }
                A0I.add(AnonymousClass0WU.A01(A002));
            }
            A083.putParcelableArrayList("actions", A0I);
        }
        int i5 = this.A05;
        if (i5 != 1) {
            A083.putInt("flags", i5);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            A083.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList arrayList2 = this.A0D;
        if (!arrayList2.isEmpty()) {
            A083.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            A083.putParcelable("background", bitmap);
        }
        int i6 = this.A01;
        if (i6 != 0) {
            A083.putInt("contentIcon", i6);
        }
        int i7 = this.A02;
        if (i7 != 8388613) {
            A083.putInt("contentIconGravity", i7);
        }
        int i8 = this.A00;
        if (i8 != -1) {
            A083.putInt("contentActionIndex", i8);
        }
        int i9 = this.A04;
        if (i9 != 0) {
            A083.putInt("customSizePreset", i9);
        }
        int i10 = this.A03;
        if (i10 != 0) {
            A083.putInt("customContentHeight", i10);
        }
        int i11 = this.A06;
        if (i11 != 80) {
            A083.putInt("gravity", i11);
        }
        int i12 = this.A07;
        if (i12 != 0) {
            A083.putInt("hintScreenTimeout", i12);
        }
        String str = this.A0B;
        if (str != null) {
            A083.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            A083.putString("bridgeTag", str2);
        }
        Bundle bundle2 = r11.A0D;
        if (bundle2 == null) {
            bundle2 = AnonymousClass002.A08();
            r11.A0D = bundle2;
        }
        bundle2.putBundle("android.wearable.EXTENSIONS", A083);
    }
}
