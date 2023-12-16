package X;

import android.os.Handler;

/* renamed from: X.5U8  reason: invalid class name */
public final class AnonymousClass5U8 {
    public AnonymousClass5ZO A00;
    public final Handler A01 = new Handler();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass5TO A03;
    public final C149357Md A04;
    public final AnonymousClass5ZR A05;
    public final AnonymousClass4UC A06 = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A07;
    public final Runnable A08 = new C117125rQ(this, 34);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[Catch:{ Exception -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r6 = this;
            X.7Md r5 = r6.A04
            X.5TO r4 = r6.A03
            monitor-enter(r5)
            X.5ZO r0 = r5.A00     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x003b
            X.4vz r3 = r5.A03     // Catch:{ all -> 0x004e }
            X.5NA r0 = r3.A04     // Catch:{ Exception -> 0x002a }
            android.content.SharedPreferences r1 = r0.A01()     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "current_search_location"
            java.lang.String r2 = X.AnonymousClass0x9.A0v(r1, r0)     // Catch:{ Exception -> 0x002a }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x002a }
            if (r0 != 0) goto L_0x0030
            X.2iY r1 = r3.A03     // Catch:{ Exception -> 0x002a }
            X.2qk r0 = r3.A00     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = X.C616731u.A00(r0, r1, r2)     // Catch:{ Exception -> 0x002a }
            X.5ZO r0 = X.AnonymousClass5ZO.A02(r0)     // Catch:{ Exception -> 0x002a }
            goto L_0x0031
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "BusinessSearchSharedPrefs/readBusinessSearchLocation: Failed to fetch the search location"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x004e }
        L_0x0030:
            r0 = 0
        L_0x0031:
            r5.A00 = r0     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x003b
            X.5ZO r0 = r4.A00()     // Catch:{ all -> 0x004e }
            r5.A00 = r0     // Catch:{ all -> 0x004e }
        L_0x003b:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x004d
            r6.A00 = r0
            boolean r0 = r0.A07()
            r1 = 2
            if (r0 == 0) goto L_0x0048
            r1 = 4
        L_0x0048:
            X.08M r0 = r6.A02
            X.C06270Wx.A04(r0, r1)
        L_0x004d:
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5U8.A00():void");
    }

    public final void A01() {
        this.A01.removeCallbacks(this.A08);
        AnonymousClass08M r2 = this.A02;
        Number A0i = C86654Ky.A0i(r2);
        if (A0i != null && A0i.intValue() == 7) {
            C06270Wx.A04(this.A06, 7);
        }
        C06270Wx.A04(r2, 6);
    }

    public final boolean A03() {
        C96214vz r1 = this.A04.A03;
        if (!r1.A04.A01().getBoolean("location_access_granted", r1.A00.A0X(6328)) || !this.A05.A05()) {
            return false;
        }
        return true;
    }

    public AnonymousClass5U8(AnonymousClass5TO r3, C149357Md r4, AnonymousClass5ZR r5, AnonymousClass4FS r6) {
        C18260x0.A0c(r6, r5, r4, r3);
        this.A07 = r6;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }

    public final void A02() {
        if (A03()) {
            C06270Wx.A04(this.A02, 7);
            C06270Wx.A04(this.A06, 0);
            this.A01.postDelayed(this.A08, 20000);
        }
    }
}
