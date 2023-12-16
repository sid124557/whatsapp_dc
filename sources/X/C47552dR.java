package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2dR  reason: invalid class name and case insensitive filesystem */
public class C47552dR {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass33J A03;
    public AnonymousClass1DW A04;
    public Integer A05;
    public Long A06;
    public List A07;
    public boolean A08;
    public byte[] A09 = null;
    public byte[] A0A;
    public byte[] A0B;
    public byte[] A0C;
    public final String A0D;
    public final List A0E;
    public final byte[] A0F;

    public C42782Pm A00() {
        String str;
        List list;
        C21891Do r0;
        byte[] bArr;
        if (this.A07 == null && this.A04 == null) {
            str = this.A0D;
            list = this.A0E;
            r0 = null;
        } else {
            C130546c9 A0G = C21891Do.DEFAULT_INSTANCE.A0G();
            List list2 = this.A07;
            if (list2 != null) {
                C21891Do r2 = (C21891Do) C18320x8.A0C(A0G);
                C188248ya r1 = r2.mutations_;
                if (!((AnonymousClass8T6) r1).A00) {
                    r1 = C130786cX.A07(r1);
                    r2.mutations_ = r1;
                }
                C170208Ch.A05(list2, r1);
            } else {
                AnonymousClass1DW r02 = this.A04;
                if (r02 != null) {
                    C21891Do r12 = (C21891Do) C18320x8.A0C(A0G);
                    r12.externalMutations_ = r02;
                    r12.bitField0_ |= 2;
                }
            }
            if (this.A03 != null) {
                C130546c9 A0G2 = AnonymousClass1AY.DEFAULT_INSTANCE.A0G();
                C172548Lq A092 = C18270x1.A09(A0G2, this.A03.A00);
                AnonymousClass1AY r13 = (AnonymousClass1AY) A0G2.A00;
                r13.bitField0_ |= 1;
                r13.id_ = A092;
                C21891Do r14 = (C21891Do) C18320x8.A0C(A0G);
                AnonymousClass1AY r03 = (AnonymousClass1AY) A0G2.A06();
                r03.getClass();
                r14.keyId_ = r03;
                r14.bitField0_ |= 16;
            }
            byte[] bArr2 = this.A0C;
            if (bArr2 != null) {
                C172548Lq A093 = C18270x1.A09(A0G, bArr2);
                C21891Do r15 = (C21891Do) A0G.A00;
                r15.bitField0_ |= 4;
                r15.snapshotMac_ = A093;
            }
            byte[] bArr3 = this.A0B;
            if (bArr3 != null) {
                C172548Lq A094 = C18270x1.A09(A0G, bArr3);
                C21891Do r16 = (C21891Do) A0G.A00;
                r16.bitField0_ |= 8;
                r16.patchMac_ = A094;
            }
            Integer num = this.A05;
            if (num != null) {
                int intValue = num.intValue();
                C21891Do r17 = (C21891Do) C18320x8.A0C(A0G);
                r17.bitField0_ |= 64;
                r17.deviceIndex_ = intValue;
            }
            if (!(this.A09 == null || this.A06 == null || (bArr = this.A0F) == null)) {
                Log.d("SyncdPrepareRequestResult/build setup the patch debug data");
                C130546c9 A0G3 = C21971Dw.DEFAULT_INSTANCE.A0G();
                byte[] bArr4 = this.A09;
                C172548Lq A0J = C18300x5.A0J(A0G3, bArr4, bArr4.length);
                C21971Dw r18 = (C21971Dw) A0G3.A00;
                r18.bitField0_ |= 1;
                r18.currentLthash_ = A0J;
                C172548Lq A0H = C18280x3.A0H(A0G3, bArr);
                C21971Dw r19 = (C21971Dw) A0G3.A00;
                r19.bitField0_ |= 2;
                r19.newLthash_ = A0H;
                C172548Lq A0H2 = C18280x3.A0H(A0G3, C18320x8.A1X(this.A06.longValue()));
                C21971Dw r110 = (C21971Dw) A0G3.A00;
                r110.bitField0_ |= 4;
                r110.patchVersion_ = A0H2;
                C172548Lq A0H3 = C18280x3.A0H(A0G3, this.A0D.getBytes(C58152un.A0D));
                C21971Dw r111 = (C21971Dw) A0G3.A00;
                r111.bitField0_ |= 8;
                r111.collectionName_ = A0H3;
                C172548Lq Bql = A0G3.A06().Bql();
                C21891Do r112 = (C21891Do) C18320x8.A0C(A0G);
                r112.bitField0_ |= 128;
                r112.clientDebugData_ = Bql;
                byte[] bArr5 = this.A0A;
                if (bArr5 != null) {
                    C172548Lq A0H4 = C18280x3.A0H(A0G3, bArr5);
                    C21971Dw r113 = (C21971Dw) A0G3.A00;
                    r113.bitField0_ |= 32;
                    r113.newLthashSubtract_ = A0H4;
                }
                int i = this.A00;
                C21971Dw r114 = (C21971Dw) C18320x8.A0C(A0G3);
                r114.bitField0_ |= 64;
                r114.numberAdd_ = i;
                int i2 = this.A02;
                C21971Dw r115 = (C21971Dw) C18320x8.A0C(A0G3);
                r115.bitField0_ |= 128;
                r115.numberRemove_ = i2;
                int i3 = this.A01;
                C21971Dw r116 = (C21971Dw) C18320x8.A0C(A0G3);
                r116.bitField0_ |= 256;
                r116.numberOverride_ = i3;
                AnonymousClass234 r04 = AnonymousClass234.Android;
                C21971Dw r117 = (C21971Dw) C18320x8.A0C(A0G3);
                r117.senderPlatform_ = r04.value;
                r117.bitField0_ |= 512;
                boolean z = this.A08;
                C21971Dw r118 = (C21971Dw) C18320x8.A0C(A0G3);
                r118.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r118.isSenderPrimary_ = z;
            }
            str = this.A0D;
            list = this.A0E;
            r0 = (C21891Do) A0G.A06();
        }
        return new C42782Pm(r0, str, list, this.A0F);
    }

    public C47552dR(String str, List list, byte[] bArr) {
        this.A0D = str;
        this.A0E = list;
        this.A0F = bArr;
    }
}
