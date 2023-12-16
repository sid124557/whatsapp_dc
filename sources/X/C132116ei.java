package X;

import java.io.OutputStream;

/* renamed from: X.6ei  reason: invalid class name and case insensitive filesystem */
public final class C132116ei extends C22251Iq {
    public final C130756cU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C132116ei(C04260Nl r7, C130766cV r8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(r7, bArr, bArr2, bArr3);
        C162457s7.A0J(bArr3, 4);
        C130546c9 A0G = C130756cU.DEFAULT_INSTANCE.A0G();
        C143046yF r0 = C143046yF.WA_PROVIDED;
        C130756cU r1 = (C130756cU) C18320x8.A0C(A0G);
        r1.keyType_ = r0.value;
        r1.bitField0_ |= 1;
        C130546c9 A0G2 = C130726cR.DEFAULT_INSTANCE.A0G();
        byte[] bArr4 = r7.A03;
        C172548Lq A02 = C172548Lq.A02(bArr4, 0, bArr4.length);
        C130726cR r12 = (C130726cR) C18320x8.A0C(A0G2);
        r12.bitField0_ |= 1;
        r12.backupCipherHeader_ = A02;
        String str = r7.A00;
        C130726cR r13 = (C130726cR) C18320x8.A0C(A0G2);
        str.getClass();
        r13.bitField0_ |= 2;
        r13.keyVersion_ = str;
        byte[] bArr5 = r7.A04;
        C172548Lq A022 = C172548Lq.A02(bArr5, 0, bArr5.length);
        C130726cR r14 = (C130726cR) C18320x8.A0C(A0G2);
        r14.bitField0_ |= 4;
        r14.serverSalt_ = A022;
        byte[] bArr6 = r7.A02;
        C172548Lq A023 = C172548Lq.A02(bArr6, 0, bArr6.length);
        C130726cR r15 = (C130726cR) C18320x8.A0C(A0G2);
        r15.bitField0_ |= 8;
        r15.googleIdSalt_ = A023;
        byte[] bArr7 = r7.A01;
        C172548Lq A024 = C172548Lq.A02(bArr7, 0, bArr7.length);
        C130726cR r16 = (C130726cR) C18320x8.A0C(A0G2);
        r16.bitField0_ |= 16;
        r16.encryptionIv_ = A024;
        C130726cR r02 = (C130726cR) A0G2.A06();
        C130756cU r17 = (C130756cU) C18320x8.A0C(A0G);
        r02.getClass();
        r17.waProvidedKeyData_ = r02;
        r17.bitField0_ |= 2;
        if (r8 != null) {
            C130756cU r18 = (C130756cU) C18320x8.A0C(A0G);
            r18.backupMetadata_ = r8;
            r18.bitField0_ |= 8;
        }
        this.A00 = (C130756cU) A0G.A06();
    }

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

    public void A03(OutputStream outputStream) {
        this.A00.A0E(outputStream);
    }

    public boolean A04(String str) {
        return C06550Ye.A0O(this.A00, str);
    }
}
