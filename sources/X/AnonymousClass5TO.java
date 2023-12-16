package X;

import com.whatsapp.Me;

/* renamed from: X.5TO  reason: invalid class name */
public final class AnonymousClass5TO {
    public AnonymousClass5ZO A00;
    public final C55682qk A01;
    public final AnonymousClass5MC A02;
    public final C56972sr A03;
    public final AnonymousClass5J1 A04;
    public final AnonymousClass4w0 A05;
    public final C105085Tn A06;
    public final AnonymousClass5OI A07;
    public final C54292oU A08;
    public final C57162tC A09;
    public final C620733j A0A;
    public final C105355Up A0B;
    public final AnonymousClass5ZI A0C;
    public final C106675Zy A0D;

    public final String A02() {
        C56972sr r0 = this.A03;
        r0.A0P();
        Me me = r0.A00;
        if (me == null) {
            this.A01.A0A("directory_country_code_resolve_error", false, "Me object from MeManager is null");
        } else {
            String A0w = AnonymousClass0x9.A0w(me);
            C162457s7.A0D(A0w);
            if (!A0w.equals("ZZ")) {
                return A0w;
            }
        }
        return "XX";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.AnonymousClass2A8.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0160, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.AnonymousClass2A8.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0177, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017b, code lost:
        r7 = r7 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017c, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5ZO A00() {
        /*
            r13 = this;
            X.5ZI r6 = r13.A0C
            r6.A08()
            X.5Up r0 = r13.A0B
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x01f2
            r0 = 3788(0xecc, float:5.308E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01f2
            java.lang.String r0 = "approx_default_location_start"
            r6.A09(r0)
            X.5Tn r9 = r13.A06
            X.4w0 r4 = r9.A02     // Catch:{ Exception -> 0x0073 }
            X.5NA r5 = r4.A04     // Catch:{ Exception -> 0x0073 }
            android.content.SharedPreferences r3 = r5.A01()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r2 = "default_location_last_updated"
            r0 = -1
            long r7 = r3.getLong(r2, r0)     // Catch:{ Exception -> 0x0073 }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0073 }
            if (r0 == 0) goto L_0x0079
            long r7 = X.AnonymousClass0x9.A05(r7)     // Catch:{ Exception -> 0x0073 }
            X.1VX r1 = r9.A05     // Catch:{ Exception -> 0x0073 }
            r0 = 3857(0xf11, float:5.405E-42)
            long r2 = X.C56952sp.A06(r1, r0)     // Catch:{ Exception -> 0x0073 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            android.content.SharedPreferences r1 = r5.A01()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r0 = "default_search_location"
            java.lang.String r2 = X.AnonymousClass0x9.A0v(r1, r0)     // Catch:{ Exception -> 0x0073 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0073 }
            if (r0 != 0) goto L_0x0079
            X.2iY r1 = r4.A03     // Catch:{ Exception -> 0x0073 }
            X.2qk r0 = r4.A00     // Catch:{ Exception -> 0x0073 }
            java.lang.String r0 = X.C616731u.A00(r0, r1, r2)     // Catch:{ Exception -> 0x0073 }
            X.5ZO r1 = X.AnonymousClass5ZO.A02(r0)     // Catch:{ Exception -> 0x0073 }
            if (r1 == 0) goto L_0x0079
            r13.A00 = r1
            java.lang.String r0 = "approx_default_location_end"
            r6.A09(r0)
            goto L_0x01f6
        L_0x0073:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationRepository/readDefaultSearchLocation: Failed to fetch the default search location"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0079:
            java.lang.String r0 = "approx_default_generation_start"
            r6.A09(r0)
            X.5J1 r5 = r13.A04
            r4 = 0
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x01c6 }
            X.1RI r0 = r5.A03     // Catch:{ Exception -> 0x01c6 }
            X.4GK r8 = r0.get()     // Catch:{ Exception -> 0x01c6 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x015e }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x015e }
            java.lang.String r9 = "SELECT latitude, longitude FROM wa_biz_profiles WHERE latitude IS NOT NULL AND longitude IS NOT NULL AND jid LIKE ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x015e }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x015e }
            X.2sr r0 = r5.A01     // Catch:{ all -> 0x015e }
            r0.A0P()     // Catch:{ all -> 0x015e }
            com.whatsapp.Me r1 = r0.A00     // Catch:{ all -> 0x015e }
            r0 = 0
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = r1.cc     // Catch:{ all -> 0x015e }
        L_0x00a5:
            r2.append(r0)     // Catch:{ all -> 0x015e }
            r0 = 37
            r2.append(r0)     // Catch:{ all -> 0x015e }
            X.AnonymousClass0x7.A1E(r2, r3, r4)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "DIRECTORY_GET_BUSINESS_PROFILES_SQL"
            android.database.Cursor r10 = r10.A0E(r9, r0, r3)     // Catch:{ all -> 0x015e }
            X.C162457s7.A0H(r10)     // Catch:{ all -> 0x0157 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "latitude"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "longitude"
            int r9 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0157 }
        L_0x00c9:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x00df
            double r2 = r10.getDouble(r11)     // Catch:{ all -> 0x0157 }
            double r0 = r10.getDouble(r9)     // Catch:{ all -> 0x0157 }
            com.google.android.gms.maps.model.LatLng r0 = X.AnonymousClass4L0.A0H(r2, r0)     // Catch:{ all -> 0x0157 }
            r12.add(r0)     // Catch:{ all -> 0x0157 }
            goto L_0x00c9
        L_0x00df:
            r10.close()     // Catch:{ all -> 0x015e }
            r8.close()     // Catch:{ Exception -> 0x01c6 }
            java.util.Iterator r11 = r12.iterator()     // Catch:{ Exception -> 0x01c6 }
            r9 = 0
            r8 = 0
        L_0x00eb:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r11.next()     // Catch:{ Exception -> 0x01c6 }
            com.google.android.gms.maps.model.LatLng r0 = (com.google.android.gms.maps.model.LatLng) r0     // Catch:{ Exception -> 0x01c6 }
            double r2 = r0.A00     // Catch:{ Exception -> 0x01c6 }
            double r0 = r0.A01     // Catch:{ Exception -> 0x01c6 }
            r10 = 10
            java.util.ArrayList r2 = X.C106845aG.A03(r2, r0, r10)     // Catch:{ Exception -> 0x01c6 }
            X.C626936e.A06(r2)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Object r1 = r2.get(r4)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c6 }
            r0 = 1
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r3 = X.C106845aG.A02(r1, r0, r10)     // Catch:{ Exception -> 0x01c6 }
            X.C162457s7.A0D(r3)     // Catch:{ Exception -> 0x01c6 }
            boolean r0 = r7.containsKey(r3)     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x0121
            X.AnonymousClass0x2.A1I(r3, r7, r4)     // Catch:{ Exception -> 0x01c6 }
        L_0x0121:
            java.lang.Object r0 = r7.get(r3)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0132
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01c6 }
            int r0 = r0 + 1
            X.AnonymousClass0x2.A1I(r3, r7, r0)     // Catch:{ Exception -> 0x01c6 }
        L_0x0132:
            java.lang.Object r0 = r7.get(r3)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00eb
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x01c6 }
            if (r8 >= r2) goto L_0x00eb
            X.1VX r1 = r5.A02     // Catch:{ Exception -> 0x01c6 }
            r0 = 3830(0xef6, float:5.367E-42)
            int r0 = r1.A0N(r0)     // Catch:{ Exception -> 0x01c6 }
            if (r2 < r0) goto L_0x00eb
            r8 = r2
            r9 = r3
            goto L_0x00eb
        L_0x014d:
            if (r9 == 0) goto L_0x01d2
            int r8 = r9.length()     // Catch:{ Exception -> 0x01c6 }
            r3 = 0
            r2 = r8
            r7 = 0
            goto L_0x017e
        L_0x0157:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0159 }
        L_0x0159:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r10, r1)     // Catch:{ all -> 0x015e }
            throw r0     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r8, r0)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0177
        L_0x0165:
            int r0 = r2 + -1
            int r1 = r1 << r0
            int r0 = r8 - r2
            char r0 = r9.charAt(r0)     // Catch:{ Exception -> 0x01c6 }
            switch(r0) {
                case 48: goto L_0x017c;
                case 49: goto L_0x0178;
                case 50: goto L_0x017b;
                case 51: goto L_0x017a;
                default: goto L_0x0171;
            }     // Catch:{ Exception -> 0x01c6 }
        L_0x0171:
            java.lang.String r0 = "Invalid Quadkey"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)     // Catch:{ Exception -> 0x01c6 }
        L_0x0177:
            throw r1     // Catch:{ Exception -> 0x01c6 }
        L_0x0178:
            int r3 = r3 + r1
            goto L_0x017c
        L_0x017a:
            int r3 = r3 + r1
        L_0x017b:
            int r7 = r7 + r1
        L_0x017c:
            int r2 = r2 + -1
        L_0x017e:
            r1 = 1
            if (r2 < r1) goto L_0x0182
            goto L_0x0165
        L_0x0182:
            long r2 = (long) r3     // Catch:{ Exception -> 0x01c6 }
            long r0 = (long) r7     // Catch:{ Exception -> 0x01c6 }
            java.util.ArrayList r3 = X.C106845aG.A04(r8, r2, r0)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ Exception -> 0x01c6 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x01c6 }
            X.C162457s7.A0D(r0)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x01c6 }
            double r0 = r0.doubleValue()     // Catch:{ Exception -> 0x01c6 }
            r2 = 1
            java.lang.Object r2 = r3.get(r2)     // Catch:{ Exception -> 0x01c6 }
            X.C626936e.A06(r2)     // Catch:{ Exception -> 0x01c6 }
            X.C162457s7.A0D(r2)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x01c6 }
            com.google.android.gms.maps.model.LatLng r8 = X.C86624Kv.A0H(r2, r0)     // Catch:{ Exception -> 0x01c6 }
            double r2 = r8.A00     // Catch:{ Exception -> 0x01c6 }
            double r0 = r8.A01     // Catch:{ Exception -> 0x01c6 }
            r7 = 10
            java.util.ArrayList r0 = X.C106845aG.A03(r2, r0, r7)     // Catch:{ Exception -> 0x01c6 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x01c6 }
            double r0 = X.C106845aG.A01(r0, r7)     // Catch:{ Exception -> 0x01c6 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x01c6 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x01c6 }
            X.3Z6 r1 = X.AnonymousClass3Z6.A02(r8, r0)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01d3
        L_0x01c6:
            r0 = move-exception
            X.2qk r2 = r5.A00
            java.lang.String r1 = "DirectoryApproxDefaultLocationManager/getApproxDefaultLocation : exception while generating approx location"
            java.lang.String r0 = r0.getMessage()
            r2.A0A(r1, r4, r0)
        L_0x01d2:
            r1 = 0
        L_0x01d3:
            java.lang.String r0 = "approx_default_generation_end"
            r6.A09(r0)
            if (r1 == 0) goto L_0x01ed
            X.5OI r2 = r13.A07
            java.lang.Object r0 = r1.first
            com.google.android.gms.maps.model.LatLng r0 = (com.google.android.gms.maps.model.LatLng) r0
            double r4 = r0.A00
            double r6 = r0.A01
            r0 = 0
            X.6B1 r3 = new X.6B1
            r3.<init>(r1, r0, r13)
            r2.A00(r3, r4, r6)
        L_0x01ed:
            X.5ZO r1 = r13.A01()
            return r1
        L_0x01f2:
            X.5ZO r1 = r13.A01()
        L_0x01f6:
            r6.A04()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TO.A00():X.5ZO");
    }

    public final AnonymousClass5ZO A01() {
        AnonymousClass5ZI r2 = this.A0C;
        r2.A09("country_default_start");
        String A022 = A02();
        String A023 = this.A0D.A02(this.A0A, A022);
        if (A023 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Localized name for country code ");
            A0o.append(A022);
            C18260x0.A1K(A0o, " is null!");
        }
        AnonymousClass5ZO r3 = new AnonymousClass5ZO((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, A023, A022, "country_default");
        r2.A09("country_default_end");
        return r3;
    }

    public AnonymousClass5TO(C55682qk r2, AnonymousClass5MC r3, C56972sr r4, AnonymousClass5J1 r5, AnonymousClass4w0 r6, C105085Tn r7, AnonymousClass5OI r8, C54292oU r9, C57162tC r10, C620733j r11, C105355Up r12, C106675Zy r13) {
        C18260x0.A0f(r4, r2, r9, r11, r13);
        C162457s7.A0J(r12, 7);
        C18260x0.A0X(r7, r3, r6);
        C18270x1.A13(r10, r5);
        this.A03 = r4;
        this.A01 = r2;
        this.A08 = r9;
        this.A0A = r11;
        this.A0D = r13;
        this.A07 = r8;
        this.A0B = r12;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A09 = r10;
        this.A04 = r5;
        this.A0C = r3.A00(871827416);
    }
}
