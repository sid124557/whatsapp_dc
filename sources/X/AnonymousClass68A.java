package X;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.68A  reason: invalid class name */
public class AnonymousClass68A extends C108145cU {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    public int A00() {
        if (this.A02 != 0) {
            AnonymousClass7E1 r0 = ((LocationPicker2) this.A01).A0V;
            if (r0 == null) {
                return 0;
            }
            C105415Uv r2 = r0.A00;
            LatLng latLng = r2.A02().A03;
            Location location = new Location("");
            C86624Kv.A0o(location, latLng);
            AnonymousClass6TF A022 = r2.A00().A02();
            Location location2 = new Location("");
            LatLng latLng2 = A022.A02;
            double d = latLng2.A00;
            LatLng latLng3 = A022.A03;
            location2.setLatitude((d + latLng3.A00) / 2.0d);
            location2.setLongitude((latLng2.A01 + latLng3.A01) / 2.0d);
            location.distanceTo(location2);
            return 0;
        }
        Location A023 = A02();
        C110885hC r02 = ((LocationPicker) this.A01).A03;
        if (r02 == null || A023 == null) {
            return 0;
        }
        AnonymousClass7ZW A06 = r02.A0S.A06();
        Location location3 = new Location("");
        C108975ds r7 = A06.A02;
        double d2 = r7.A00;
        C108975ds r6 = A06.A03;
        location3.setLatitude((d2 + r6.A00) / 2.0d);
        location3.setLongitude((r7.A01 + r6.A01) / 2.0d);
        return (int) A023.distanceTo(location3);
    }

    public Location A02() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass7E1 r0 = ((LocationPicker2) obj).A0V;
            if (r0 == null) {
                return null;
            }
            LatLng latLng = r0.A00.A02().A03;
            Location location = new Location("");
            C86624Kv.A0o(location, latLng);
            return location;
        }
        C110885hC r02 = ((LocationPicker) obj).A03;
        if (r02 == null) {
            return null;
        }
        C108975ds r2 = r02.A02().A03;
        Location location2 = new Location("");
        location2.setLatitude(r2.A00);
        location2.setLongitude(r2.A01);
        return location2;
    }

    public void A0C() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj;
            C105415Uv r1 = locationPicker2.A02;
            if (r1 != null) {
                locationPicker2.A06 = null;
                r1.A06();
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) obj;
        C110885hC r12 = locationPicker.A03;
        if (r12 != null) {
            locationPicker.A07 = null;
            r12.A06();
        }
    }

    public void A0D() {
        C109005dv r0;
        C109005dv r02;
        if (this.A02 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A01;
            if (locationPicker2.A02 != null) {
                if (!this.A0t && locationPicker2.A06 == null) {
                    A0C();
                }
                if (!this.A0t && (r02 = this.A0g) != null) {
                    for (PlaceInfo placeInfo : r02.A0F) {
                        C127776Tg r6 = new C127776Tg();
                        r6.A08 = AnonymousClass4L0.A0H(placeInfo.A01, placeInfo.A02);
                        if (!TextUtils.isEmpty(placeInfo.A06)) {
                            r6.A09 = placeInfo.A06;
                        }
                        if (!TextUtils.isEmpty(placeInfo.A0B)) {
                            r6.A0A = placeInfo.A0B;
                        }
                        r6.A07 = locationPicker2.A04;
                        r6.A00 = 0.5f;
                        r6.A01 = 0.5f;
                        C105345Uo A03 = locationPicker2.A02.A03(r6);
                        A03.A07(placeInfo);
                        placeInfo.A0D = A03;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) this.A01;
        if (locationPicker.A03 != null) {
            if (!this.A0t && locationPicker.A07 == null) {
                A0C();
            }
            if (!this.A0t && (r0 = this.A0g) != null) {
                for (PlaceInfo placeInfo2 : r0.A0F) {
                    C156967hV r4 = new C156967hV();
                    r4.A01 = C108975ds.A00(placeInfo2.A01, placeInfo2.A02);
                    if (!TextUtils.isEmpty(placeInfo2.A06)) {
                        r4.A03 = placeInfo2.A06;
                    }
                    if (!TextUtils.isEmpty(placeInfo2.A0B)) {
                        r4.A02 = placeInfo2.A0B;
                    }
                    r4.A00 = locationPicker.A05;
                    float[] fArr = r4.A06;
                    fArr[0] = 0.5f;
                    fArr[1] = 0.5f;
                    C110885hC r1 = locationPicker.A03;
                    C88534Zc r03 = new C88534Zc(r1, r4);
                    r1.A0C(r03);
                    r03.A0H = r1;
                    r03.A0K = placeInfo2;
                    placeInfo2.A0D = r03;
                }
            }
        }
    }

    public void A0G(int i) {
        int i2 = this.A02;
        Object obj = this.A01;
        if (i2 != 0) {
            C105415Uv r1 = ((LocationPicker2) obj).A02;
            if (r1 != null) {
                r1.A08(0, 0, 0, i);
                return;
            }
            return;
        }
        C110885hC r12 = ((LocationPicker) obj).A03;
        if (r12 != null) {
            r12.A08(0, 0, i);
        }
    }

    public void A0I(Location location, Float f, int i, boolean z) {
        float floatValue;
        float floatValue2;
        if (this.A02 != 0) {
            AnonymousClass7E1 r0 = ((LocationPicker2) this.A01).A0V;
            if (r0 != null) {
                Integer valueOf = Integer.valueOf(i);
                C183968qx r5 = (C183968qx) this.A00;
                if (location != null) {
                    LatLng A0F = C86624Kv.A0F(location);
                    C105415Uv r3 = r0.A00;
                    float f2 = r3.A02().A02;
                    if (f == null) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = f.floatValue();
                    }
                    float f3 = f2 + floatValue2;
                    if (valueOf != null) {
                        r3.A08(0, 0, 0, valueOf.intValue());
                    }
                    AnonymousClass7BU A022 = C106555Zl.A02(A0F, f3);
                    if (z) {
                        r3.A0C(A022, r5);
                    } else {
                        r3.A0A(A022);
                    }
                }
            }
        } else {
            LocationPicker locationPicker = (LocationPicker) this.A01;
            if (locationPicker.A03 != null && location != null) {
                C108975ds A012 = C108975ds.A01(location);
                float f4 = locationPicker.A03.A02().A02;
                if (f == null) {
                    floatValue = 0.0f;
                } else {
                    floatValue = f.floatValue();
                }
                locationPicker.A03.A08(0, 0, i);
                AnonymousClass7UM A013 = C153847c7.A01(A012, f4 + floatValue);
                C110885hC r2 = locationPicker.A03;
                if (z) {
                    r2.A0B(A013, (C183698qT) this.A00, 400);
                } else {
                    r2.A0A(A013);
                }
            }
        }
    }

    public void A0T(boolean z) {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj;
            if (locationPicker2.A02 != null) {
                if (locationPicker2.A06 == null) {
                    A0C();
                }
                Location location = this.A06;
                if (location != null) {
                    LatLng A0H = AnonymousClass4L0.A0H(location.getLatitude(), this.A06.getLongitude());
                    LocationPicker2.A0C(A0H, locationPicker2);
                    locationPicker2.A02.A0L(false);
                    C151747Wd r1 = new C151747Wd();
                    r1.A01(A0H);
                    r1.A00 = 15.0f;
                    r1.A01 = 0.0f;
                    r1.A02 = 0.0f;
                    CameraPosition A002 = r1.A00();
                    C105415Uv r2 = locationPicker2.A02;
                    AnonymousClass7BU A003 = C106555Zl.A00(A002);
                    if (z) {
                        r2.A0C(A003, (C183968qx) this.A00);
                    } else {
                        r2.A0A(A003);
                    }
                }
            }
        } else {
            LocationPicker locationPicker = (LocationPicker) obj;
            if (locationPicker.A03 != null) {
                if (locationPicker.A07 == null) {
                    A0C();
                }
                Location location2 = this.A06;
                if (location2 != null) {
                    C108975ds A004 = C108975ds.A00(location2.getLatitude(), this.A06.getLongitude());
                    LocationPicker.A0C(A004, locationPicker);
                    locationPicker.A03.A0E(false);
                    C150797Sg r12 = new C150797Sg();
                    r12.A02 = A004;
                    r12.A01 = 15.0f;
                    r12.A00 = 0.0f;
                    C166477yk A005 = r12.A00();
                    C110885hC r3 = locationPicker.A03;
                    AnonymousClass7UM A006 = C153847c7.A00(A005);
                    if (z) {
                        r3.A0B(A006, (C183698qT) this.A00, 400);
                    } else {
                        r3.A0A(A006);
                    }
                }
            }
        }
    }

    public void onLocationChanged(Location location) {
        C110885hC r2;
        C105415Uv r1;
        if (this.A02 != 0) {
            if (location != null) {
                LocationPicker2 locationPicker2 = (LocationPicker2) this.A01;
                if (locationPicker2.A0X.A06 == null && (r1 = locationPicker2.A02) != null) {
                    r1.A0A(C106555Zl.A01(C86624Kv.A0F(location)));
                }
                if (locationPicker2.A0X.A0t && locationPicker2.A02 != null) {
                    if (locationPicker2.A06 == null) {
                        A0C();
                    }
                    LocationPicker2.A0C(C86624Kv.A0F(location), locationPicker2);
                }
                if (locationPicker2.A0X.A0s && locationPicker2.A02 != null) {
                    locationPicker2.A02.A09(C106555Zl.A01(C86624Kv.A0F(location)));
                }
                locationPicker2.A0W.A06 = location;
            } else {
                return;
            }
        } else if (location != null) {
            LocationPicker locationPicker = (LocationPicker) this.A01;
            if (locationPicker.A0P.A06 == null && (r2 = locationPicker.A03) != null) {
                C108975ds A012 = C108975ds.A01(location);
                AnonymousClass7UM r0 = new AnonymousClass7UM();
                r0.A06 = A012;
                r2.A0A(r0);
            }
            if (locationPicker.A0P.A0t && locationPicker.A03 != null) {
                if (locationPicker.A07 == null) {
                    A0C();
                }
                LocationPicker.A0C(C108975ds.A01(location), locationPicker);
            }
            if (locationPicker.A0P.A0s && locationPicker.A03 != null) {
                C108975ds A013 = C108975ds.A01(location);
                C110885hC r12 = locationPicker.A03;
                AnonymousClass7UM r02 = new AnonymousClass7UM();
                r02.A06 = A013;
                r12.A09(r02);
            }
        } else {
            return;
        }
        super.onLocationChanged(location);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass68A(X.C111095hX r39, X.C55682qk r40, X.C159027ky r41, X.C69263Wi r42, X.C56972sr r43, X.C56492s4 r44, X.C621033m r45, X.AnonymousClass5UX r46, X.C56422rx r47, X.C48952fk r48, X.C613330g r49, X.AnonymousClass5U6 r50, X.C620633i r51, X.C56612sH r52, X.C54292oU r53, X.AnonymousClass5ZR r54, X.AnonymousClass33p r55, X.C620733j r56, X.C56982ss r57, X.AnonymousClass487 r58, X.AnonymousClass5IY r59, X.C27821ej r60, X.AnonymousClass5Y0 r61, com.whatsapp.emoji.search.EmojiSearchProvider r62, X.AnonymousClass1VX r63, X.AnonymousClass33K r64, com.whatsapp.location.LocationPicker r65, X.C621233o r66, X.C28071fd r67, X.AnonymousClass5OZ r68, com.whatsapp.nativelibloader.WhatsAppLibLoader r69, X.C60152y5 r70, X.C55832qz r71, X.C66433Lk r72, X.C105895Wv r73, X.AnonymousClass4FS r74) {
        /*
            r38 = this;
            r0 = 0
            r2 = r38
            r2.A02 = r0
            r0 = r65
            r2.A01 = r0
            r29 = r66
            r28 = r64
            r27 = r63
            r26 = r62
            r25 = r61
            r24 = r60
            r23 = r59
            r13 = r49
            r14 = r50
            r30 = r67
            r31 = r68
            r3 = r39
            r32 = r69
            r4 = r40
            r33 = r70
            r5 = r41
            r34 = r71
            r6 = r42
            r10 = r46
            r35 = r72
            r7 = r43
            r11 = r47
            r36 = r73
            r8 = r44
            r12 = r48
            r37 = r74
            r9 = r45
            r15 = r51
            r16 = r52
            r17 = r53
            r18 = r54
            r19 = r55
            r20 = r56
            r21 = r57
            r22 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1 = 3
            X.90V r0 = new X.90V
            r0.<init>(r2, r1)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68A.<init>(X.5hX, X.2qk, X.7ky, X.3Wi, X.2sr, X.2s4, X.33m, X.5UX, X.2rx, X.2fk, X.30g, X.5U6, X.33i, X.2sH, X.2oU, X.5ZR, X.33p, X.33j, X.2ss, X.487, X.5IY, X.1ej, X.5Y0, com.whatsapp.emoji.search.EmojiSearchProvider, X.1VX, X.33K, com.whatsapp.location.LocationPicker, X.33o, X.1fd, X.5OZ, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.2y5, X.2qz, X.3Lk, X.5Wv, X.4FS):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass68A(X.C111095hX r39, X.C55682qk r40, X.C159027ky r41, X.C69263Wi r42, X.C56972sr r43, X.C56492s4 r44, X.C621033m r45, X.AnonymousClass5UX r46, X.C56422rx r47, X.C48952fk r48, X.C613330g r49, X.AnonymousClass5U6 r50, X.C620633i r51, X.C56612sH r52, X.C54292oU r53, X.AnonymousClass5ZR r54, X.AnonymousClass33p r55, X.C620733j r56, X.C56982ss r57, X.AnonymousClass487 r58, X.AnonymousClass5IY r59, X.C27821ej r60, X.AnonymousClass5Y0 r61, com.whatsapp.emoji.search.EmojiSearchProvider r62, X.AnonymousClass1VX r63, X.AnonymousClass33K r64, com.whatsapp.location.LocationPicker2 r65, X.C621233o r66, X.C28071fd r67, X.AnonymousClass5OZ r68, com.whatsapp.nativelibloader.WhatsAppLibLoader r69, X.C60152y5 r70, X.C55832qz r71, X.C66433Lk r72, X.C105895Wv r73, X.AnonymousClass4FS r74) {
        /*
            r38 = this;
            r1 = 1
            r2 = r38
            r2.A02 = r1
            r0 = r65
            r2.A01 = r0
            r29 = r66
            r28 = r64
            r27 = r63
            r26 = r62
            r25 = r61
            r24 = r60
            r23 = r59
            r13 = r49
            r14 = r50
            r30 = r67
            r31 = r68
            r3 = r39
            r32 = r69
            r4 = r40
            r33 = r70
            r5 = r41
            r34 = r71
            r6 = r42
            r10 = r46
            r35 = r72
            r7 = r43
            r11 = r47
            r36 = r73
            r8 = r44
            r12 = r48
            r37 = r74
            r9 = r45
            r15 = r51
            r16 = r52
            r17 = r53
            r18 = r54
            r19 = r55
            r20 = r56
            r21 = r57
            r22 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.90W r0 = new X.90W
            r0.<init>(r2, r1)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68A.<init>(X.5hX, X.2qk, X.7ky, X.3Wi, X.2sr, X.2s4, X.33m, X.5UX, X.2rx, X.2fk, X.30g, X.5U6, X.33i, X.2sH, X.2oU, X.5ZR, X.33p, X.33j, X.2ss, X.487, X.5IY, X.1ej, X.5Y0, com.whatsapp.emoji.search.EmojiSearchProvider, X.1VX, X.33K, com.whatsapp.location.LocationPicker2, X.33o, X.1fd, X.5OZ, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.2y5, X.2qz, X.3Lk, X.5Wv, X.4FS):void");
    }
}
