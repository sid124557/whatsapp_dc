package X;

import android.os.Handler;

/* renamed from: X.4UB  reason: invalid class name */
public class AnonymousClass4UB extends C06270Wx {
    public int A00 = 0;
    public AnonymousClass5ZO A01;
    public final Handler A02 = new Handler();
    public final AnonymousClass4w0 A03;
    public final C105085Tn A04;
    public final AnonymousClass5TO A05;
    public final C181988ng A06;
    public final C184258rV A07;
    public final AnonymousClass5ZR A08;
    public final C105355Up A09;
    public final AnonymousClass4FS A0A;
    public final Runnable A0B = new C117125rQ(this, 30);

    public int A0I() {
        switch (this.A00) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public final C136186lz A0J() {
        String str = null;
        switch (this.A00) {
            case 0:
                return new AnonymousClass6lY(new C989453v(this, 36));
            case 1:
                return new AnonymousClass6lU();
            case 2:
                AnonymousClass5ZO r2 = this.A01;
                if (r2 != null) {
                    return new C136006lh(r2, new C989453v(this, 38));
                }
                break;
            case 4:
                break;
            case 7:
                if (this.A09.A07()) {
                    return new C136106lr(this.A07, (String) null);
                }
                String str2 = this.A01.A08;
                C626936e.A06(str2);
                return new C135946lb(new C989453v(this, 37), str2);
            default:
                return new C135926lT();
        }
        AnonymousClass5ZO r0 = this.A01;
        if (r0 != null) {
            str = r0.A08;
        }
        return new C96324wB(new C989453v(this, 39), str);
    }

    public void A0K() {
        long j;
        if (this.A08.A05()) {
            AnonymousClass4w0 r1 = this.A03;
            if (r1.A04.A01().getBoolean("location_access_granted", r1.A00.A0A())) {
                this.A00 = 1;
                Handler handler = this.A02;
                Runnable runnable = this.A0B;
                if (this.A09.A06()) {
                    j = C625635p.A0L;
                } else {
                    j = 60000;
                }
                handler.postDelayed(runnable, j);
                A0L();
            }
        }
        AnonymousClass5TO r2 = this.A05;
        AnonymousClass5ZO A002 = r2.A00();
        this.A01 = A002;
        if (A002.A07()) {
            int i = 4;
            if (r2.A0B.A00().contains(r2.A02())) {
                i = 7;
            }
            this.A00 = i;
        } else {
            this.A00 = 0;
        }
        A0L();
    }

    public AnonymousClass4UB(AnonymousClass4w0 r3, C105085Tn r4, AnonymousClass5TO r5, C181988ng r6, C184258rV r7, AnonymousClass5ZR r8, C105355Up r9, AnonymousClass4FS r10) {
        this.A0A = r10;
        this.A08 = r8;
        this.A09 = r9;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A03 = r3;
        this.A05 = r5;
        r10.BkM(new C117125rQ(this, 31));
    }

    public final void A0L() {
        C136186lz A0J = A0J();
        Object A072 = A07();
        if (A072 == null || !A072.equals(A0J)) {
            A0G(A0J);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r2.A0B.A00().contains(r1) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.AnonymousClass5ZO r10) {
        /*
            r9 = this;
            boolean r0 = r10.A07()
            if (r0 == 0) goto L_0x001f
            X.5TO r0 = r9.A05
            java.lang.String r1 = r0.A02()
            X.5Up r0 = r0.A0B
            java.util.Set r0 = r0.A00()
            boolean r1 = r0.contains(r1)
            r0 = 7
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 4
        L_0x001a:
            r9.A00 = r0
            r9.A01 = r10
            return
        L_0x001f:
            X.5Up r0 = r9.A09
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x006b
            X.5TO r2 = r9.A05
            com.google.android.gms.maps.model.LatLng r3 = X.AnonymousClass5ZO.A00(r10)
            X.2oU r0 = r2.A08
            android.content.Context r1 = r0.A00
            X.33j r0 = r2.A0A
            java.util.Locale r0 = X.C620733j.A02(r0)
            double r4 = r3.A00
            double r6 = r3.A01
            android.location.Geocoder r3 = new android.location.Geocoder
            r3.<init>(r1, r0)
            r8 = 1
            java.util.List r1 = r3.getFromLocation(r4, r6, r8)     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0058 }
            if (r0 != 0) goto L_0x005e
            java.lang.Object r0 = X.C18290x4.A0k(r1)     // Catch:{ Exception -> 0x0058 }
            android.location.Address r0 = (android.location.Address) r0     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r0.getCountryCode()     // Catch:{ Exception -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateCountryCodeFromLatLng/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x005e:
            r1 = 0
        L_0x005f:
            X.5Up r0 = r2.A0B
            java.util.Set r0 = r0.A00()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0019
        L_0x006b:
            r0 = 2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4UB.A0M(X.5ZO):void");
    }
}
