package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0dI  reason: invalid class name and case insensitive filesystem */
public final class C08080dI implements C16950uI {
    public final int A00;
    public final int A01;
    public final ClipData A02;
    public final Uri A03;
    public final Bundle A04;

    public ClipData B5Y() {
        return this.A02;
    }

    public int B7j() {
        return this.A00;
    }

    public int BDA() {
        return this.A01;
    }

    public ContentInfo BEZ() {
        return null;
    }

    public C08080dI(C08060dG r5) {
        ClipData clipData = r5.A02;
        clipData.getClass();
        this.A02 = clipData;
        this.A01 = r5.A01;
        int i = r5.A00;
        if ((i & 1) == i) {
            this.A00 = i;
            this.A03 = r5.A03;
            this.A04 = r5.A04;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1G("Requested flags 0x", A0o, i);
        AnonymousClass000.A1G(", but only 0x", A0o, 1);
        throw AnonymousClass000.A0F(" are allowed", A0o);
    }

    public String toString() {
        String str;
        String valueOf;
        String A0e;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContentInfoCompat{clip=");
        A0o.append(this.A02.getDescription());
        A0o.append(", source=");
        int i = this.A01;
        if (i == 1) {
            str = "SOURCE_CLIPBOARD";
        } else if (i != 2) {
            str = "SOURCE_DRAG_AND_DROP";
        } else {
            str = "SOURCE_INPUT_METHOD";
        }
        A0o.append(str);
        A0o.append(", flags=");
        int i2 = this.A00;
        if ((i2 & 1) != 0) {
            valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            valueOf = String.valueOf(i2);
        }
        A0o.append(valueOf);
        Uri uri = this.A03;
        String str2 = "";
        if (uri == null) {
            A0e = str2;
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(", hasLinkUri(");
            A0o2.append(uri.toString().length());
            A0e = AnonymousClass000.A0e(A0o2);
        }
        A0o.append(A0e);
        if (this.A04 != null) {
            str2 = ", hasExtras";
        }
        A0o.append(str2);
        return AnonymousClass000.A0g(A0o);
    }
}
