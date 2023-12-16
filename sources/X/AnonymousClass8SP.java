package X;

import java.security.AlgorithmParametersSpi;

/* renamed from: X.8SP  reason: invalid class name */
public abstract class AnonymousClass8SP extends AlgorithmParametersSpi {
    public static boolean A00(String str) {
        if (str == null || str.equals("ASN.1")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca A[SYNTHETIC, Splitter:B:56:0x00ca] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0136
            r2 = r8
            boolean r0 = r8 instanceof org.spongycastle.jcajce.provider.symmetric.PBEPBKDF2.AlgParams
            if (r0 == 0) goto L_0x0032
            org.spongycastle.jcajce.provider.symmetric.PBEPBKDF2$AlgParams r2 = (org.spongycastle.jcajce.provider.symmetric.PBEPBKDF2.AlgParams) r2
            java.lang.Class<javax.crypto.spec.PBEParameterSpec> r0 = javax.crypto.spec.PBEParameterSpec.class
            if (r9 == r0) goto L_0x0019
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            if (r9 == r0) goto L_0x0019
            java.lang.String r1 = "unknown parameter spec passed to PBKDF2 PBE parameters object."
            java.security.spec.InvalidParameterSpecException r0 = new java.security.spec.InvalidParameterSpecException
            r0.<init>(r1)
            throw r0
        L_0x0019:
            X.8d2 r1 = r2.A00
            X.8dY r0 = r1.A02
            byte[] r3 = r0.A00
            X.8dV r0 = r1.A00
            byte[] r1 = r0.A01
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            int r0 = r0.intValue()
            javax.crypto.spec.PBEParameterSpec r2 = new javax.crypto.spec.PBEParameterSpec
            r2.<init>(r3, r0)
            return r2
        L_0x0032:
            boolean r0 = r8 instanceof org.spongycastle.jcajce.provider.symmetric.AES.AlgParamsGCM
            if (r0 == 0) goto L_0x0056
            org.spongycastle.jcajce.provider.symmetric.AES$AlgParamsGCM r2 = (org.spongycastle.jcajce.provider.symmetric.AES.AlgParamsGCM) r2
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            if (r9 == r0) goto L_0x009d
            java.lang.Class r0 = X.C159887md.A00
            if (r0 == r9) goto L_0x009d
            java.lang.Class<X.8U5> r0 = X.AnonymousClass8U5.class
            if (r9 == r0) goto L_0x0122
            java.lang.Class<javax.crypto.spec.IvParameterSpec> r0 = javax.crypto.spec.IvParameterSpec.class
            if (r9 != r0) goto L_0x0086
            X.8d0 r0 = r2.A00
            byte[] r0 = r0.A01
        L_0x004c:
            byte[] r0 = X.C161007oo.A02(r0)
        L_0x0050:
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r0)
            return r2
        L_0x0056:
            boolean r0 = r8 instanceof org.spongycastle.jcajce.provider.symmetric.AES.AlgParamsCCM
            if (r0 == 0) goto L_0x0071
            org.spongycastle.jcajce.provider.symmetric.AES$AlgParamsCCM r2 = (org.spongycastle.jcajce.provider.symmetric.AES.AlgParamsCCM) r2
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            if (r9 == r0) goto L_0x00bb
            java.lang.Class r0 = X.C159887md.A00
            if (r0 == r9) goto L_0x00bb
            java.lang.Class<X.8U5> r0 = X.AnonymousClass8U5.class
            if (r9 == r0) goto L_0x0115
            java.lang.Class<javax.crypto.spec.IvParameterSpec> r0 = javax.crypto.spec.IvParameterSpec.class
            if (r9 != r0) goto L_0x00a4
            X.8cz r0 = r2.A00
            byte[] r0 = r0.A01
            goto L_0x004c
        L_0x0071:
            org.spongycastle.jcajce.provider.symmetric.AES$AlgParams r2 = (org.spongycastle.jcajce.provider.symmetric.AES.AlgParams) r2
            java.lang.Class<javax.crypto.spec.IvParameterSpec> r0 = javax.crypto.spec.IvParameterSpec.class
            if (r9 == r0) goto L_0x0083
            java.lang.Class<java.security.spec.AlgorithmParameterSpec> r0 = java.security.spec.AlgorithmParameterSpec.class
            if (r9 == r0) goto L_0x0083
            java.lang.String r1 = "unknown parameter spec passed to IV parameters object."
            java.security.spec.InvalidParameterSpecException r0 = new java.security.spec.InvalidParameterSpecException
            r0.<init>(r1)
            throw r0
        L_0x0083:
            byte[] r0 = r2.A00
            goto L_0x0050
        L_0x0086:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AlgorithmParameterSpec not recognized: "
            r1.append(r0)
            java.lang.String r0 = r9.getName()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.security.spec.InvalidParameterSpecException r0 = new java.security.spec.InvalidParameterSpecException
            r0.<init>(r1)
            throw r0
        L_0x009d:
            java.lang.Class r7 = X.C159887md.A00
            if (r7 == 0) goto L_0x0122
            X.8d0 r0 = r2.A00
            goto L_0x00c1
        L_0x00a4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AlgorithmParameterSpec not recognized: "
            r1.append(r0)
            java.lang.String r0 = r9.getName()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.security.spec.InvalidParameterSpecException r0 = new java.security.spec.InvalidParameterSpecException
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            java.lang.Class r7 = X.C159887md.A00
            if (r7 == 0) goto L_0x0115
            X.8cz r0 = r2.A00
        L_0x00c1:
            X.8e3 r0 = r0.Bqk()
            if (r0 == 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r6 = 0
            goto L_0x00d3
        L_0x00ca:
            X.8dq r0 = X.C176958dq.A0C(r0)     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            X.8d0 r6 = new X.8d0     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            r6.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
        L_0x00d3:
            r5 = 2
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            r4 = 0
            r1[r4] = r0     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            java.lang.Class<byte[]> r0 = byte[].class
            r3 = 1
            r1[r3] = r0     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            java.lang.reflect.Constructor r2 = r7.getConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            int r0 = r6.A00     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            int r0 = r0 * 8
            X.AnonymousClass000.A1P(r1, r0, r4)     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            byte[] r0 = r6.A01     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            byte[] r0 = X.C161007oo.A02(r0)     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            r1[r3] = r0     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            java.lang.Object r2 = r2.newInstance(r1)     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            java.security.spec.AlgorithmParameterSpec r2 = (java.security.spec.AlgorithmParameterSpec) r2     // Catch:{ NoSuchMethodException -> 0x010d, Exception -> 0x00fc }
            return r2
        L_0x00fc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Construction failed: "
            java.lang.String r1 = X.AnonymousClass000.A0a(r0, r1, r2)
            java.security.spec.InvalidParameterSpecException r0 = new java.security.spec.InvalidParameterSpecException
            r0.<init>(r1)
            throw r0
        L_0x010d:
            java.lang.String r1 = "No constructor found!"
            java.security.spec.InvalidParameterSpecException r0 = new java.security.spec.InvalidParameterSpecException
            r0.<init>(r1)
            throw r0
        L_0x0115:
            X.8cz r0 = r2.A00
            byte[] r0 = r0.A01
            byte[] r1 = X.C161007oo.A02(r0)
            X.8cz r0 = r2.A00
            int r0 = r0.A00
            goto L_0x012e
        L_0x0122:
            X.8d0 r0 = r2.A00
            byte[] r0 = r0.A01
            byte[] r1 = X.C161007oo.A02(r0)
            X.8d0 r0 = r2.A00
            int r0 = r0.A00
        L_0x012e:
            int r0 = r0 * 8
            X.8U5 r2 = new X.8U5
            r2.<init>(r1, r0)
            return r2
        L_0x0136:
            java.lang.String r0 = "argument to getParameterSpec must not be null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8SP.engineGetParameterSpec(java.lang.Class):java.security.spec.AlgorithmParameterSpec");
    }
}
