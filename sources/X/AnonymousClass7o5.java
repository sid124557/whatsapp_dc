package X;

import java.util.Map;

/* renamed from: X.7o5  reason: invalid class name */
public abstract class AnonymousClass7o5 {
    public static final Object A01(C127856To r3, Object obj) {
        C178438hX r32 = r3.A00;
        if (r32 == null) {
            return obj;
        }
        AnonymousClass6UC r33 = (AnonymousClass6UC) r32;
        Object obj2 = r33.A01.get(((Number) obj).intValue());
        if (obj2 != null || !r33.A02.containsKey("gms_unknown")) {
            return obj2;
        }
        return "gms_unknown";
    }

    public static final void A02(C127856To r2, Object obj, StringBuilder sb) {
        String obj2;
        int i = r2.A02;
        if (i == 11) {
            Class cls = r2.A06;
            C162177rO.A02(cls);
            obj2 = cls.cast(obj).toString();
        } else if (i == 7) {
            obj2 = "\"";
            sb.append(obj2);
            sb.append(C155317ef.A00((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(obj2);
    }

    public Object A03(C127856To r5) {
        if (this instanceof C128116Uv) {
            C128116Uv r1 = (C128116Uv) this;
            int i = r5.A04;
            if (i == 1) {
                return Integer.valueOf(r1.A05);
            }
            if (i == 2) {
                return r1.A03;
            }
            if (i == 3) {
                return Integer.valueOf(r1.A00);
            }
            if (i == 4) {
                return r1.A04;
            }
            throw C86604Kt.A0h("Unknown SafeParcelable id=", AnonymousClass001.A0o(), i);
        } else if (this instanceof C128106Uu) {
            C128106Uu r12 = (C128106Uu) this;
            int i2 = r5.A04;
            if (i2 == 1) {
                return Integer.valueOf(r12.A04);
            }
            if (i2 == 2) {
                return r12.A00;
            }
            if (i2 == 3) {
                return r12.A01;
            }
            if (i2 == 4) {
                return r12.A02;
            }
            throw C86604Kt.A0h("Unknown SafeParcelable id=", AnonymousClass001.A0o(), i2);
        } else if (this instanceof C128096Ut) {
            C128096Ut r0 = (C128096Ut) this;
            int i3 = r5.A04;
            switch (i3) {
                case 1:
                    return Integer.valueOf(r0.A05);
                case 2:
                    return r0.A00;
                case 3:
                    return r0.A01;
                case 4:
                    return r0.A02;
                case 5:
                    return r0.A03;
                case 6:
                    return r0.A04;
                default:
                    throw C86604Kt.A0h("Unknown SafeParcelable id=", AnonymousClass001.A0o(), i3);
            }
        } else if (this instanceof C128086Us) {
            C128086Us r13 = (C128086Us) this;
            int i4 = r5.A04;
            if (i4 == 1) {
                return Integer.valueOf(r13.A03);
            }
            if (i4 == 2) {
                return r13.A02;
            }
            if (i4 == 4) {
                return r13.A01;
            }
            throw C86604Kt.A0h("Unknown SafeParcelable id=", AnonymousClass001.A0o(), i4);
        } else {
            String str = r5.A07;
            boolean z = ((AnonymousClass6UM) this) instanceof AnonymousClass6UL;
            if (r5.A06 != null) {
                if (z) {
                    throw AnonymousClass002.A0G("Converting to JSON does not require this method.");
                }
                try {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("get");
                    A0o.append(upperCase);
                    A0o.append(substring);
                    return AnonymousClass000.A0K(getClass(), this, A0o.toString());
                } catch (Exception e) {
                    throw C18330xA.A09(e);
                }
            } else if (!z) {
                return null;
            } else {
                throw AnonymousClass002.A0G("Converting to JSON does not require this method.");
            }
        }
    }

    public Map A04() {
        if (this instanceof AnonymousClass6UL) {
            AnonymousClass6UL r1 = (AnonymousClass6UL) this;
            AnonymousClass6SX r0 = r1.A02;
            if (r0 == null) {
                return null;
            }
            String str = r1.A03;
            C162177rO.A02(str);
            return (Map) r0.A02.get(str);
        } else if (this instanceof C128116Uv) {
            return C128116Uv.A07;
        } else {
            if (this instanceof C128106Uu) {
                return C128106Uu.A06;
            }
            if (this instanceof C128096Ut) {
                return C128096Ut.A06;
            }
            return C128086Us.A05;
        }
    }

    public boolean A05(C127856To r3) {
        if (this instanceof C128116Uv) {
            return C18300x5.A1X(((C128116Uv) this).A06, r3.A04);
        }
        if (this instanceof C128106Uu) {
            return C18300x5.A1X(((C128106Uu) this).A05, r3.A04);
        }
        if (this instanceof C128096Ut) {
            return true;
        }
        if (this instanceof C128086Us) {
            return C18300x5.A1X(((C128086Us) this).A04, r3.A04);
        }
        if (r3.A03 == 11) {
            if (r3.A0A) {
                throw AnonymousClass002.A0G("Concrete type arrays not supported");
            }
            throw AnonymousClass002.A0G("Concrete types not supported");
        } else if (!(((AnonymousClass6UM) this) instanceof AnonymousClass6UL)) {
            return false;
        } else {
            throw AnonymousClass002.A0G("Converting to JSON does not require this method.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r6 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        r3.append(r0);
        r3.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        r0 = android.util.Base64.encodeToString(r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r5 = r9.A04()
            r0 = 100
            java.lang.StringBuilder r3 = X.AnonymousClass6CA.A0Y(r0)
            java.util.Iterator r8 = X.C18280x3.A0i(r5)
        L_0x000e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r2 = X.AnonymousClass001.A0m(r8)
            java.lang.Object r7 = r5.get(r2)
            X.6To r7 = (X.C127856To) r7
            boolean r0 = r9.A05(r7)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r9.A03(r7)
            java.lang.Object r6 = A01(r7, r0)
            int r0 = r3.length()
            java.lang.String r4 = ","
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "{"
            r3.append(r0)
        L_0x0039:
            java.lang.String r1 = "\""
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = "\":"
            r3.append(r0)
            if (r6 != 0) goto L_0x004e
            java.lang.String r0 = "null"
        L_0x004a:
            r3.append(r0)
            goto L_0x000e
        L_0x004e:
            int r0 = r7.A03
            switch(r0) {
                case 8: goto L_0x007d;
                case 9: goto L_0x0084;
                case 10: goto L_0x009b;
                default: goto L_0x0053;
            }
        L_0x0053:
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0079
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            java.lang.String r0 = "["
            r3.append(r0)
            int r2 = r6.size()
            r1 = 0
        L_0x0063:
            if (r1 >= r2) goto L_0x0076
            if (r1 <= 0) goto L_0x006a
            r3.append(r4)
        L_0x006a:
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x0073
            A02(r7, r0, r3)
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x0076:
            java.lang.String r0 = "]"
            goto L_0x004a
        L_0x0079:
            A02(r7, r6, r3)
            goto L_0x000e
        L_0x007d:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
            goto L_0x008b
        L_0x0084:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 10
        L_0x008b:
            if (r6 != 0) goto L_0x0096
            r0 = 0
        L_0x008e:
            r3.append(r0)
            r3.append(r1)
            goto L_0x000e
        L_0x0096:
            java.lang.String r0 = android.util.Base64.encodeToString(r6, r0)
            goto L_0x008e
        L_0x009b:
            java.util.HashMap r6 = (java.util.HashMap) r6
            X.AnonymousClass72N.A00(r3, r6)
            goto L_0x000e
        L_0x00a2:
            r3.append(r4)
            goto L_0x0039
        L_0x00a6:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = "}"
        L_0x00ae:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            return r0
        L_0x00b3:
            java.lang.String r0 = "{}"
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7o5.toString():java.lang.String");
    }
}
