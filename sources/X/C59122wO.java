package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2wO  reason: invalid class name and case insensitive filesystem */
public class C59122wO {
    public final C59542x5 A00;

    public static void A00(C21991Dy r2, AnonymousClass1n9 r3, boolean z) {
        r3.A00 = r2.degreesLatitude_;
        r3.A01 = r2.degreesLongitude_;
        int i = r2.bitField0_;
        if ((i & 16) != 0) {
            r3.A02 = r2.url_;
        }
        if ((i & 4) != 0) {
            r3.A01 = r2.name_;
        }
        if ((i & 8) != 0) {
            r3.A00 = r2.address_;
        }
        if ((i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            r3.A0y().A04(r2.jpegThumbnail_.A07(), z);
            r3.A02 = 2;
        }
    }

    public C59122wO(C59542x5 r1) {
        this.A00 = r1;
    }

    public void A01(AnonymousClass173 r6, AnonymousClass3Z2 r7, AnonymousClass1n9 r8, byte[] bArr, boolean z) {
        C614630w A0y = r8.A0y();
        double d = r8.A00;
        C21991Dy r3 = (C21991Dy) C18320x8.A0C(r6);
        r3.bitField0_ |= 1;
        r3.degreesLatitude_ = d;
        double d2 = r8.A01;
        C21991Dy r32 = (C21991Dy) C18320x8.A0C(r6);
        r32.bitField0_ |= 2;
        r32.degreesLongitude_ = d2;
        if (!TextUtils.isEmpty(r8.A02)) {
            String str = r8.A02;
            C21991Dy r1 = (C21991Dy) C18320x8.A0C(r6);
            str.getClass();
            r1.bitField0_ |= 16;
            r1.url_ = str;
        }
        if (!TextUtils.isEmpty(r8.A01)) {
            String str2 = r8.A01;
            C21991Dy r12 = (C21991Dy) C18320x8.A0C(r6);
            str2.getClass();
            r12.bitField0_ |= 4;
            r12.name_ = str2;
        }
        if (!TextUtils.isEmpty(r8.A00)) {
            String str3 = r8.A00;
            C21991Dy r13 = (C21991Dy) C18320x8.A0C(r6);
            str3.getClass();
            r13.bitField0_ |= 8;
            r13.address_ = str3;
        }
        if (!z && A0y.A09() != null) {
            C172548Lq A09 = C18270x1.A09(r6, A0y.A09());
            C21991Dy r14 = (C21991Dy) r6.A00;
            r14.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r14.jpegThumbnail_ = A09;
        }
        if (C59542x5.A01(r7, r8, bArr)) {
            AnonymousClass1EF A02 = this.A00.A02(r7, r8, bArr, z);
            C21991Dy r15 = (C21991Dy) C18320x8.A0C(r6);
            A02.getClass();
            r15.contextInfo_ = A02;
            r15.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
    }
}
