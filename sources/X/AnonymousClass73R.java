package X;

/* renamed from: X.73R  reason: invalid class name */
public class AnonymousClass73R extends C175988aC {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass73R(int i) {
        super((AnonymousClass7TE) null);
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r0 == null) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x01cf;
                case 2: goto L_0x01f0;
                case 3: goto L_0x021a;
                case 4: goto L_0x023b;
                case 5: goto L_0x0265;
                case 6: goto L_0x0286;
                case 7: goto L_0x02b8;
                case 8: goto L_0x02d9;
                case 9: goto L_0x0303;
                case 10: goto L_0x0326;
                case 11: goto L_0x0352;
                case 12: goto L_0x0375;
                case 13: goto L_0x03a1;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03f2;
                default: goto L_0x0005;
            }
        L_0x0005:
            r4 = 0
            if (r9 == 0) goto L_0x0019
            boolean r0 = r9 instanceof java.util.Date
            if (r0 != 0) goto L_0x0449
            boolean r0 = r9 instanceof java.lang.Number
            if (r0 == 0) goto L_0x001a
            long r0 = X.C18310x6.A0B(r9)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r0)
        L_0x0019:
            return r4
        L_0x001a:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x0436
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "p.m."
            java.lang.String r0 = "pm"
            java.lang.String r2 = r9.replace(r1, r0)
            java.lang.String r1 = "a.m."
            java.lang.String r0 = "am"
            java.lang.String r1 = r2.replace(r1, r0)
            java.lang.String r0 = " -/:,.+年月日曜時分秒"
            java.util.StringTokenizer r3 = new java.util.StringTokenizer
            r3.<init>(r1, r0)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0019
            java.lang.String r2 = r3.nextToken()
            int r1 = r2.length()
            r0 = 4
            r7 = 0
            if (r1 != r0) goto L_0x00c1
            char r0 = r2.charAt(r7)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x00c1
            java.util.GregorianCalendar r5 = X.C161987qw.A03()
            int r1 = java.lang.Integer.parseInt(r2)
            r0 = 1
            r5.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0430
            java.lang.String r0 = r3.nextToken()
            java.lang.Integer r0 = X.C161987qw.A00(r0)
            int r0 = r0.intValue()
            r6 = 2
            r5.set(r6, r0)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0430
            java.lang.String r4 = r3.nextToken()
            char r0 = r4.charAt(r7)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0430
            int r0 = r4.length()
            r2 = 5
            if (r0 != r2) goto L_0x00b9
            char r1 = r4.charAt(r6)
            r0 = 84
            if (r1 != r0) goto L_0x00b9
            java.lang.String r0 = r4.substring(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r5.set(r2, r0)
            r0 = 3
            java.lang.String r0 = r4.substring(r0)
            if (r0 != 0) goto L_0x00b4
        L_0x00aa:
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0430
            java.lang.String r0 = r3.nextToken()
        L_0x00b4:
            java.util.Date r9 = X.C161987qw.A02(r0, r5, r3)
            return r9
        L_0x00b9:
            int r0 = java.lang.Integer.parseInt(r4)
            r5.set(r2, r0)
            goto L_0x00aa
        L_0x00c1:
            java.util.TreeMap r0 = X.C161987qw.A01
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0019
            java.lang.String r2 = r3.nextToken()
        L_0x00d3:
            java.util.TreeMap r1 = X.C161987qw.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x014b
            java.util.GregorianCalendar r6 = X.C161987qw.A03()
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r2, r1)
            if (r0 == 0) goto L_0x041d
            int r0 = r0.intValue()
            r2 = 2
            r6.set(r2, r0)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0435
            java.lang.String r0 = r3.nextToken()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 5
            r6.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0435
            java.lang.String r5 = r3.nextToken()
            char r0 = r5.charAt(r7)
            boolean r0 = java.lang.Character.isLetter(r0)
            if (r0 == 0) goto L_0x011d
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0435
            java.lang.String r5 = r3.nextToken()
        L_0x011d:
            int r1 = r5.length()
            r0 = 4
            if (r1 != r0) goto L_0x0144
            r2 = 1
            int r1 = java.lang.Integer.parseInt(r5)
            r0 = 100
            if (r1 >= r0) goto L_0x0133
            r0 = 30
            if (r1 <= r0) goto L_0x0141
            int r1 = r1 + 2000
        L_0x0133:
            r6.set(r2, r1)
        L_0x0136:
            boolean r0 = r3.hasMoreTokens()
            if (r0 != 0) goto L_0x0414
            java.util.Date r9 = r6.getTime()
            return r9
        L_0x0141:
            int r1 = r1 + 1900
            goto L_0x0133
        L_0x0144:
            if (r1 != r2) goto L_0x0136
            java.util.Date r9 = X.C161987qw.A02(r5, r6, r3)
            return r9
        L_0x014b:
            char r0 = r2.charAt(r7)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0019
            java.util.GregorianCalendar r5 = X.C161987qw.A03()
            int r1 = java.lang.Integer.parseInt(r2)
            r0 = 5
            r5.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0435
            java.lang.String r0 = r3.nextToken()
            java.lang.Integer r0 = X.C161987qw.A00(r0)
            int r1 = r0.intValue()
            r0 = 2
            r5.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0435
            java.lang.String r0 = r3.nextToken()
            r2 = 1
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 100
            if (r1 >= r0) goto L_0x0190
            r0 = 30
            if (r1 <= r0) goto L_0x01a2
            int r1 = r1 + 2000
        L_0x0190:
            r5.set(r2, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0430
            java.lang.String r0 = r3.nextToken()
            java.util.Date r9 = X.C161987qw.A02(r0, r5, r3)
            return r9
        L_0x01a2:
            int r1 = r1 + 1900
            goto L_0x0190
        L_0x01a5:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Long[] r4 = new java.lang.Long[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x01b2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x01b2
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x01ca
            long r0 = X.C18310x6.A0B(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x01ca:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x01b2
        L_0x01cf:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            float[] r4 = new float[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x01dc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            float r0 = X.AnonymousClass001.A05(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x01dc
        L_0x01f0:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Float[] r4 = new java.lang.Float[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x01fd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x01fd
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0215
            float r0 = X.AnonymousClass001.A05(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x0215:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x01fd
        L_0x021a:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            double[] r4 = new double[r0]
            java.util.Iterator r5 = r9.iterator()
            r3 = 0
        L_0x0227:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r5.next()
            int r2 = r3 + 1
            double r0 = X.AnonymousClass6C9.A02(r0)
            r4[r3] = r0
            r3 = r2
            goto L_0x0227
        L_0x023b:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Double[] r4 = new java.lang.Double[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x0248:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0248
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 != 0) goto L_0x0260
            double r0 = X.AnonymousClass6C9.A02(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0260:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0248
        L_0x0265:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            boolean[] r4 = new boolean[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x0272:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x0272
        L_0x0286:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Boolean[] r4 = new java.lang.Boolean[r0]
            java.util.Iterator r3 = r9.iterator()
            r1 = 0
        L_0x0293:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L_0x0293
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x02a8
            r4[r1] = r2
        L_0x02a5:
            int r1 = r1 + 1
            goto L_0x0293
        L_0x02a8:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L_0x044a
            int r0 = X.AnonymousClass001.A0K(r2)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.AnonymousClass6C7.A1V(r4, r1, r0)
            goto L_0x02a5
        L_0x02b8:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            int[] r4 = new int[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x02c5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            int r0 = X.AnonymousClass001.A0K(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x02c5
        L_0x02d9:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Integer[] r4 = new java.lang.Integer[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x02e6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x02e6
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x02fe
            int r0 = X.AnonymousClass001.A0K(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x02fe:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x02e6
        L_0x0303:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            short[] r4 = new short[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x0310:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r4[r2] = r0
            r2 = r1
            goto L_0x0310
        L_0x0326:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Short[] r4 = new java.lang.Short[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x0333:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0333
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L_0x034d
            java.lang.Number r1 = (java.lang.Number) r1
            short r0 = r1.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r0)
        L_0x034d:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0333
        L_0x0352:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            byte[] r4 = new byte[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x035f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            r4[r2] = r0
            r2 = r1
            goto L_0x035f
        L_0x0375:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Byte[] r4 = new java.lang.Byte[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x0382:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0382
            boolean r0 = r1 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x039c
            java.lang.Number r1 = (java.lang.Number) r1
            byte r0 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
        L_0x039c:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0382
        L_0x03a1:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            char[] r4 = new char[r0]
            java.util.Iterator r5 = r9.iterator()
            r3 = 0
            r2 = 0
        L_0x03af:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r5.next()
            int r1 = r2 + 1
            java.lang.String r0 = r0.toString()
            char r0 = r0.charAt(r3)
            r4[r2] = r0
            r2 = r1
            goto L_0x03af
        L_0x03c7:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            java.lang.Character[] r4 = new java.lang.Character[r0]
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
            r1 = 0
        L_0x03d5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L_0x03d5
            java.lang.String r0 = r0.toString()
            char r0 = r0.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x03d5
        L_0x03f2:
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            long[] r4 = new long[r0]
            java.util.Iterator r5 = r9.iterator()
            r3 = 0
        L_0x03ff:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r5.next()
            int r2 = r3 + 1
            int r0 = X.AnonymousClass001.A0K(r0)
            long r0 = (long) r0
            r4[r3] = r0
            r3 = r2
            goto L_0x03ff
        L_0x0414:
            java.lang.String r0 = r3.nextToken()
            java.util.Date r9 = X.C161987qw.A02(r0, r6, r3)
            return r9
        L_0x041d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "can not parse "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " as month"
            java.lang.NullPointerException r0 = X.AnonymousClass0x2.A0V(r0, r1)
            throw r0
        L_0x0430:
            java.util.Date r9 = r5.getTime()
            return r9
        L_0x0435:
            return r4
        L_0x0436:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Primitive: Can not convert "
            X.C18260x0.A1T(r1, r0, r9)
            java.lang.String r0 = " to int"
            r1.append(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass6C7.A0e(r1)
            throw r0
        L_0x0449:
            return r9
        L_0x044a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "can not convert "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " toBoolean"
            r1.append(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass6C7.A0e(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73R.A03(java.lang.Object):java.lang.Object");
    }
}
