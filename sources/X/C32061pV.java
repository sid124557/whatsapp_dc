package X;

import java.util.Map;

/* renamed from: X.1pV  reason: invalid class name and case insensitive filesystem */
public class C32061pV extends C32151pe {
    public final C56612sH A00;
    public final C60592yo A01;
    public final AnonymousClass2RV A02;
    public final AnonymousClass9U5 A03;
    public final Map A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32061pV(X.C55682qk r12, X.C56612sH r13, X.AnonymousClass1VX r14, X.AnonymousClass4FV r15, X.C60592yo r16, X.C67813Qt r17, X.AnonymousClass31C r18, X.AnonymousClass2RV r19, X.AnonymousClass9U5 r20, java.util.Map r21) {
        /*
            r11 = this;
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r13
            r0 = r19
            r11.A02 = r0
            r0 = r20
            r11.A03 = r0
            r11.A01 = r7
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            r0 = 209(0xd1, float:2.93E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "w:gp2"
            java.lang.Integer r1 = X.C18290x4.A0f(r0, r1, r2)
            java.lang.String r0 = "contacts"
            r2.put(r0, r1)
            r0 = 202(0xca, float:2.83E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "business"
            r2.put(r0, r1)
            r0 = 203(0xcb, float:2.84E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "account_sync"
            r2.put(r0, r1)
            r0 = 204(0xcc, float:2.86E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "devices"
            r2.put(r0, r1)
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "server_sync"
            r2.put(r0, r1)
            r0 = 228(0xe4, float:3.2E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "encrypted_backup"
            r2.put(r0, r1)
            r0 = 229(0xe5, float:3.21E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "disappearing_mode"
            r2.put(r0, r1)
            r0 = 104(0x68, float:1.46E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "psa"
            r2.put(r0, r1)
            r0 = 234(0xea, float:3.28E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "privacy_token"
            r2.put(r0, r1)
            r0 = 235(0xeb, float:3.3E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "server"
            r2.put(r0, r1)
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "picture"
            r2.put(r0, r1)
            r0 = 236(0xec, float:3.31E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status"
            r2.put(r0, r1)
            r0 = 238(0xee, float:3.34E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "gdpr"
            r2.put(r0, r1)
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "location"
            r2.put(r0, r1)
            r0 = 241(0xf1, float:3.38E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "encrypt"
            r2.put(r0, r1)
            r0 = 97
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "mediaretry"
            r2.put(r0, r1)
            r0 = 247(0xf7, float:3.46E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "pay"
            r2.put(r0, r1)
            r0 = 248(0xf8, float:3.48E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "authkey_rotation"
            r2.put(r0, r1)
            r0 = 246(0xf6, float:3.45E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "waffle"
            r2.put(r0, r1)
            r0 = 251(0xfb, float:3.52E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "registration"
            r2.put(r0, r1)
            r0 = 252(0xfc, float:3.53E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "link_code_companion_reg"
            r2.put(r0, r1)
            r0 = 253(0xfd, float:3.55E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "avatars:update"
            r2.put(r0, r1)
            r0 = 256(0x100, float:3.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "newsletter"
            r2.put(r0, r1)
            r0 = 258(0x102, float:3.62E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "mex"
            r2.put(r0, r1)
            r0 = 260(0x104, float:3.64E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "username"
            r2.put(r0, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            r11.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32061pV.<init>(X.2qk, X.2sH, X.1VX, X.4FV, X.2yo, X.3Qt, X.31C, X.2RV, X.9U5, java.util.Map):void");
    }
}
