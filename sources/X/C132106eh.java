package X;

import java.io.OutputStream;

/* renamed from: X.6eh  reason: invalid class name and case insensitive filesystem */
public final class C132106eh extends C56292rk {
    public final C130756cU A00;
    public final byte[] A01;
    public final byte[] A02;

    public C130766cV A00() {
        C130756cU r2 = this.A00;
        if (!AnonymousClass000.A1S(r2.bitField0_ & 8)) {
            return null;
        }
        C130766cV r0 = r2.backupMetadata_;
        if (r0 == null) {
            return C130766cV.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public String A01() {
        C130756cU r1 = this.A00;
        if (!AnonymousClass000.A1S(r1.bitField0_ & 8)) {
            return null;
        }
        C130766cV r0 = r1.backupMetadata_;
        C130766cV r12 = r0;
        if (r0 == null) {
            r0 = C130766cV.DEFAULT_INSTANCE;
        }
        if (!AnonymousClass000.A1S(r0.bitField0_ & 4)) {
            return null;
        }
        if (r12 == null) {
            r12 = C130766cV.DEFAULT_INSTANCE;
        }
        return r12.jidSuffix_;
    }

    public void A02(C54292oU r1) {
    }

    public void A03(OutputStream outputStream) {
        this.A00.A0E(outputStream);
    }

    public boolean A04(String str) {
        return C06550Ye.A0O(this.A00, str);
    }

    public byte[] A05() {
        return this.A01;
    }

    public byte[] A06() {
        return this.A02;
    }

    public C132106eh(C130766cV r6, byte[] bArr, byte[] bArr2) {
        super(bArr2, bArr);
        this.A02 = bArr;
        this.A01 = bArr2;
        C130546c9 A0G = C130756cU.DEFAULT_INSTANCE.A0G();
        C143046yF r0 = C143046yF.HSM_CONTROLLED;
        C130756cU r1 = (C130756cU) C18320x8.A0C(A0G);
        r1.keyType_ = r0.value;
        r1.bitField0_ |= 1;
        byte[] bArr3 = this.A01;
        C130546c9 A0G2 = C130716cQ.DEFAULT_INSTANCE.A0G();
        C172548Lq A022 = C172548Lq.A02(bArr3, 0, bArr3.length);
        C130716cQ r12 = (C130716cQ) C18320x8.A0C(A0G2);
        r12.bitField0_ |= 1;
        r12.encryptionIv_ = A022;
        C130716cQ r02 = (C130716cQ) A0G2.A06();
        C130756cU r13 = (C130756cU) C18320x8.A0C(A0G);
        r02.getClass();
        r13.hsmControlledKeyData_ = r02;
        r13.bitField0_ |= 4;
        if (r6 != null) {
            C130756cU r14 = (C130756cU) C18320x8.A0C(A0G);
            r14.backupMetadata_ = r6;
            r14.bitField0_ |= 8;
        }
        this.A00 = (C130756cU) A0G.A06();
    }
}
