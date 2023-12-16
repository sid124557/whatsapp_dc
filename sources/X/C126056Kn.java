package X;

/* renamed from: X.6Kn  reason: invalid class name and case insensitive filesystem */
public class C126056Kn extends AnonymousClass8L6 {
    public final C06290Wz mMetricsMap = new C06290Wz();
    public final C06290Wz mMetricsValid = new C06290Wz();

    public static boolean A00(C06290Wz r7, C06290Wz r8) {
        boolean equals;
        if (r7 != r8) {
            int size = r7.size();
            if (size == r8.size()) {
                int i = 0;
                while (i < size) {
                    Object[] objArr = r7.A02;
                    int i2 = i << 1;
                    Object obj = objArr[i2];
                    Object obj2 = objArr[i2 + 1];
                    Object obj3 = r8.get(obj);
                    if (obj2 != null) {
                        equals = obj2.equals(obj3);
                    } else if (obj3 == null) {
                        equals = r8.containsKey(obj);
                    }
                    if (equals) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C126056Kn r5 = (C126056Kn) obj;
            if (!A00(this.mMetricsValid, r5.mMetricsValid) || !A00(this.mMetricsMap, r5.mMetricsMap)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8L6 A02(Class cls) {
        return (AnonymousClass8L6) cls.cast(this.mMetricsMap.get(cls));
    }

    public void A03(C126056Kn r8) {
        C06290Wz r1;
        Boolean bool;
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) this.mMetricsMap.A02[i << 1];
            AnonymousClass8L6 A02 = r8.A02(cls);
            if (A02 != null) {
                AnonymousClass8L6 A022 = A02(cls);
                if (A022 instanceof C126016Kj) {
                    C126016Kj r2 = (C126016Kj) A022;
                    C126016Kj r6 = (C126016Kj) A02;
                    r2.uptimeMs = r6.uptimeMs;
                    r2.realtimeMs = r6.realtimeMs;
                } else if (A022 instanceof C126026Kk) {
                    C126026Kk r22 = (C126026Kk) A022;
                    C126026Kk r62 = (C126026Kk) A02;
                    r22.mobileBytesRx = r62.mobileBytesRx;
                    r22.mobileBytesTx = r62.mobileBytesTx;
                    r22.wifiBytesRx = r62.wifiBytesRx;
                    r22.wifiBytesTx = r62.wifiBytesTx;
                } else if (A022 instanceof C126046Km) {
                    ((C126046Km) A022).A02((C126046Km) A02);
                } else if (A022 instanceof C126036Kl) {
                    ((C126036Kl) A022).A02((C126036Kl) A02);
                } else {
                    ((C126056Kn) A022).A03((C126056Kn) A02);
                }
                boolean A04 = r8.A04(cls);
                r1 = this.mMetricsValid;
                if (A04) {
                    bool = Boolean.TRUE;
                }
                bool = Boolean.FALSE;
            } else {
                r1 = this.mMetricsValid;
                bool = Boolean.FALSE;
            }
            r1.put(cls, bool);
        }
    }

    public boolean A04(Class cls) {
        Boolean bool = (Boolean) this.mMetricsValid.get(cls);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.mMetricsValid, C18300x5.A04(this.mMetricsMap));
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Composite Metrics{\n");
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            A0o.append(this.mMetricsMap.A02[i2 + 1]);
            if (A04((Class) this.mMetricsMap.A02[i2])) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            A0o.append(str);
            A0o.append(10);
        }
        return AnonymousClass000.A0g(A0o);
    }
}
