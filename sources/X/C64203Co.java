package X;

/* renamed from: X.3Co  reason: invalid class name and case insensitive filesystem */
public class C64203Co implements AnonymousClass4F2, AnonymousClass65A {
    public final C56972sr A00;
    public final C47872dy A01;
    public final C64773Ex A02;
    public final C64213Cp A03;
    public final AnonymousClass314 A04;
    public final C56612sH A05;
    public final AnonymousClass33p A06;
    public final C56892sj A07;
    public final C72303dV A08;
    public final C56662sM A09;
    public final C55172pv A0A;
    public final AnonymousClass318 A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FS A0D;

    public final boolean A00(C60212yB r10, long j) {
        long j2 = r10.A05;
        if (j - j2 >= ((long) Math.min(35, Math.max(this.A0C.A0O(C58422vE.A02, 730), 1))) * 86400) {
            return true;
        }
        if (r10.A02 <= j2 || r10.A04 == AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A06), "adv_last_device_job_ts") || (j * 1000) - r10.A03 < 90000000) {
            return false;
        }
        return true;
    }

    public void BUE() {
        this.A0D.BkN(C69983Zk.A00(this, 32), "DeviceADVInfoChecker/checkDeviceListADVInfo");
    }

    public void BUN() {
        this.A0D.BkN(C69983Zk.A00(this, 32), "DeviceADVInfoChecker/checkDeviceListADVInfo");
    }

    public C64203Co(C56972sr r1, C47872dy r2, C64773Ex r3, C64213Cp r4, AnonymousClass314 r5, C56612sH r6, AnonymousClass33p r7, C56892sj r8, C72303dV r9, C56662sM r10, C55172pv r11, AnonymousClass318 r12, AnonymousClass1VX r13, AnonymousClass4FS r14) {
        this.A05 = r6;
        this.A0C = r13;
        this.A00 = r1;
        this.A0D = r14;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A0B = r12;
        this.A0A = r11;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A07 = r8;
        this.A01 = r2;
    }

    public /* synthetic */ void BUB() {
    }

    public /* synthetic */ void BUC() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUF() {
    }
}
