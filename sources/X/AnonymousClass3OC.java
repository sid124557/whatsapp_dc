package X;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3OC  reason: invalid class name */
public class AnonymousClass3OC implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C64773Ex A00;
    public final C620633i A01;
    public final C54292oU A02;
    public final C620733j A03;
    public final AnonymousClass1VX A04;
    public final C59542x5 A05;

    public void AyD(C55032pg r12, C624134x r13) {
        C30411mP r5 = (C30411mP) r13;
        AnonymousClass1A4 r4 = r12.A00;
        AnonymousClass1C0 r0 = ((AnonymousClass1EU) r4.A00).contactsArrayMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1C0.DEFAULT_INSTANCE;
        }
        C130546c9 A0H = r0.A0H();
        if (!TextUtils.isEmpty(r5.A00)) {
            String str = r5.A00;
            AnonymousClass1C0 r1 = (AnonymousClass1C0) C18320x8.A0C(A0H);
            str.getClass();
            r1.bitField0_ |= 1;
            r1.displayName_ = str;
        }
        List A1v = r5.A1v();
        int i = 0;
        while (i < A1v.size() && i < 257) {
            String A0n = AnonymousClass001.A0n(A1v, i);
            C130546c9 A0G = C21481Bz.DEFAULT_INSTANCE.A0G();
            String A002 = new AnonymousClass5Y4(this.A00, this.A01, this.A02, this.A03).A00(A0n);
            if (A002 != null) {
                C21481Bz r14 = (C21481Bz) C18320x8.A0C(A0G);
                r14.bitField0_ |= 1;
                r14.displayName_ = A002;
            }
            C21481Bz r15 = (C21481Bz) C18320x8.A0C(A0G);
            A0n.getClass();
            r15.bitField0_ |= 2;
            r15.vcard_ = A0n;
            C130786cX A06 = A0G.A06();
            AnonymousClass1C0 r2 = (AnonymousClass1C0) C18320x8.A0C(A0H);
            A06.getClass();
            C188248ya r16 = r2.contacts_;
            if (!((AnonymousClass8T6) r16).A00) {
                r16 = C130786cX.A07(r16);
                r2.contacts_ = r16;
            }
            r16.add(A06);
            i++;
        }
        if (!Collections.unmodifiableList(((AnonymousClass1C0) A0H.A00).contacts_).isEmpty() || !r12.A02 || !C56952sp.A0E(this.A04)) {
            AnonymousClass3Z2 r22 = r12.A01;
            byte[] bArr = r12.A09;
            if (C59542x5.A01(r22, r13, bArr)) {
                AnonymousClass1EF A003 = C55032pg.A00(this.A05, r12, r22, r13, bArr);
                AnonymousClass1C0 r17 = (AnonymousClass1C0) C18320x8.A0C(A0H);
                A003.getClass();
                r17.contextInfo_ = A003;
                r17.bitField0_ |= 2;
            }
            AnonymousClass1EU A0T = C18290x4.A0T(r4);
            AnonymousClass1C0 r02 = (AnonymousClass1C0) A0H.A06();
            r02.getClass();
            A0T.contactsArrayMessage_ = r02;
            A0T.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            return;
        }
        Log.w("FMessageContactArrayProtobuf/buildProtobufMessage/empty contact list");
        throw AnonymousClass24A.A00(11);
    }

    public C624134x BgW(C55962rC r7) {
        AnonymousClass1EU r1 = r7.A0B;
        if ((r1.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
            return null;
        }
        AnonymousClass1C0 r3 = r1.contactsArrayMessage_;
        if (r3 == null) {
            r3 = AnonymousClass1C0.DEFAULT_INSTANCE;
        }
        C30411mP r5 = new C30411mP(r7.A0D, r7.A05);
        if ((r3.bitField0_ & 1) != 0) {
            r5.A00 = r3.displayName_;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (C21481Bz r2 : r3.contacts_) {
            if ((r2.bitField0_ & 2) != 0) {
                if (A0s.size() >= 257) {
                    break;
                }
                A0s.add(r2.vcard_);
            }
        }
        if (!A0s.isEmpty() || !this.A04.A0Y(C58422vE.A02, 4466)) {
            r5.A1w(A0s);
            return r5;
        }
        throw AnonymousClass24W.A01(C18300x5.A0Z(), "Not valid contacts");
    }

    public AnonymousClass3OC(C64773Ex r1, C620633i r2, C54292oU r3, C620733j r4, AnonymousClass1VX r5, C59542x5 r6) {
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
    }
}
