package X;

import java.util.HashSet;
import java.util.Objects;

/* renamed from: X.2r3  reason: invalid class name and case insensitive filesystem */
public class C55872r3 {
    public final C55682qk A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final C621133n A03;
    public final C48972fm A04;
    public final C29041iB A05;
    public final AnonymousClass4FS A06;

    public long A00() {
        long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this.A02), "adv_timestamp_sec");
        C56612sH r2 = this.A01;
        long A0F = r2.A0F() / 1000;
        long A0D = r2.A0D() / 1000;
        long j = 1 + A0A;
        if (j > A0F + 86400) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CompanionDeviceAdvUtil/getTimestampSec invalid ts lastTs=");
            A0o.append(A0A);
            A0o.append("; ntpTs=");
            A0o.append(A0F);
            C18260x0.A11("; serverTs=", A0o, A0D);
            return -1;
        }
        if (Math.abs(A0D - A0F) <= 86400) {
            A0F = A0D;
        }
        return Math.max(A0F, j);
    }

    public AnonymousClass1DS A01(AnonymousClass239 r6, int i, int i2, long j) {
        int A032;
        C29041iB r2 = this.A05;
        HashSet A0K = AnonymousClass002.A0K();
        if (!r2.A0A.A0Y()) {
            A032 = 0;
        } else {
            A032 = C18310x6.A03(AnonymousClass0x2.A0F(r2.A0F), "adv_current_key_index");
        }
        C18270x1.A1K(A0K, A032);
        C172878Nf it = r2.A0K.A00().values().iterator();
        while (it.hasNext()) {
            C18270x1.A1K(A0K, ((AnonymousClass33G) it.next()).A04);
        }
        if (i == -1) {
            C55682qk r3 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("currentIndex=");
            A0o.append(i2);
            r3.A0A("invalid_rawId_key_index_list", true, AnonymousClass000.A0Z("; timestampSec=", A0o, j));
        }
        C18270x1.A1K(A0K, i2);
        C130546c9 A0K2 = C18300x5.A0K(AnonymousClass1DS.DEFAULT_INSTANCE);
        AnonymousClass1DS r1 = (AnonymousClass1DS) A0K2.A00;
        r1.bitField0_ |= 1;
        r1.rawId_ = i;
        AnonymousClass1DS r12 = (AnonymousClass1DS) C18320x8.A0C(A0K2);
        r12.bitField0_ |= 4;
        r12.currentIndex_ = i2;
        AnonymousClass1DS r13 = (AnonymousClass1DS) C18320x8.A0C(A0K2);
        r13.bitField0_ |= 2;
        r13.timestamp_ = j;
        AnonymousClass1DS r22 = (AnonymousClass1DS) C18320x8.A0C(A0K2);
        C85224Fk r14 = r22.validIndexes_;
        if (!((AnonymousClass8T6) r14).A00) {
            r14 = C130786cX.A06(r14);
            r22.validIndexes_ = r14;
        }
        C170208Ch.A05(A0K, r14);
        AnonymousClass1DS r15 = (AnonymousClass1DS) C18320x8.A0C(A0K2);
        r15.accountType_ = r6.value;
        r15.bitField0_ |= 8;
        return (AnonymousClass1DS) A0K2.A06();
    }

    public C21451Bw A02(AnonymousClass1DS r7) {
        AnonymousClass2KK r0;
        C621133n r2 = this.A03;
        if (r2.A0X()) {
            r0 = r2.A00.A04();
        } else {
            C48972fm r1 = this.A04;
            Objects.requireNonNull(r2);
            r0 = (AnonymousClass2KK) C48972fm.A00(r1, r2, 1);
        }
        C626936e.A06(r0);
        C48462ew r5 = r0.A00;
        byte[][] bArr = new byte[2][];
        bArr[0] = C58152un.A0J;
        byte[] A042 = AnonymousClass36A.A04(r7.A0F(), bArr, 1);
        C130546c9 A0G = C21451Bw.DEFAULT_INSTANCE.A0G();
        if (AnonymousClass239.A00(r7.accountType_) == AnonymousClass239.HOSTED) {
            C172548Lq A09 = C18270x1.A09(A0G, r0.A01.A00.A01);
            C21451Bw r12 = (C21451Bw) A0G.A00;
            r12.bitField0_ |= 4;
            r12.accountSignatureKey_ = A09;
        }
        C172548Lq A092 = C18270x1.A09(A0G, AnonymousClass36G.A09(r5, A042));
        C21451Bw r13 = (C21451Bw) A0G.A00;
        r13.bitField0_ |= 2;
        r13.accountSignature_ = A092;
        C172548Lq Bql = r7.Bql();
        C21451Bw r14 = (C21451Bw) C18320x8.A0C(A0G);
        r14.bitField0_ |= 1;
        r14.details_ = Bql;
        return (C21451Bw) A0G.A06();
    }

    public void A03() {
        C18270x1.A0i(C18270x1.A03(this.A02), "adv_timestamp_sec", -1);
        this.A06.BkM(C71313bu.A00(this, 32));
    }

    public void A04(long j) {
        AnonymousClass33p r4 = this.A02;
        C18270x1.A0g(C18270x1.A03(r4), "adv_key_index_list_update_retry_count");
        C18270x1.A0g(C18270x1.A03(r4), "adv_key_index_list_last_failure_time");
        C18270x1.A0i(C18270x1.A03(r4), "adv_key_index_list_last_update_time", this.A01.A0H());
        C18260x0.A0K(r4, "adv_key_index_list_require_update");
        if (j > 0) {
            C18270x1.A0i(C18270x1.A03(r4), "adv_timestamp_sec", j);
        }
    }

    public C55872r3(C55682qk r1, C56612sH r2, AnonymousClass33p r3, C621133n r4, C48972fm r5, C29041iB r6, AnonymousClass4FS r7) {
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
    }
}
