package X;

import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

/* renamed from: X.8U3  reason: invalid class name */
public class AnonymousClass8U3 extends MacSpi implements C180118kW {
    public static final Class A01 = C1454375w.A00("javax.crypto.spec.GCMParameterSpec", AnonymousClass8U3.class);
    public C185978uY A00;

    public byte[] engineDoFinal() {
        C185978uY r2 = this.A00;
        byte[] bArr = new byte[r2.B9H()];
        r2.B24(bArr, 0);
        return bArr;
    }

    public int engineGetMacLength() {
        return this.A00.B9H();
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        C834748n r1;
        if (key != null) {
            if (key instanceof C173268Oy) {
                C173268Oy r5 = (C173268Oy) key;
                C173268Oy.A00(r5);
                if (r5.param != null) {
                    C173268Oy.A00(r5);
                    r1 = r5.param;
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw AnonymousClass6CA.A0Z("PBE requires PBE parameters to be set.");
                } else if (algorithmParameterSpec != null) {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    C173268Oy.A00(r5);
                    int i = r5.type;
                    C173268Oy.A00(r5);
                    C158467k1 A012 = C160987om.A01(i, r5.digest);
                    byte[] encoded = r5.getEncoded();
                    byte[] salt = pBEParameterSpec.getSalt();
                    int iterationCount = pBEParameterSpec.getIterationCount();
                    A012.A01 = encoded;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    C173268Oy.A00(r5);
                    r1 = A012.A01(r5.keySize);
                } else {
                    throw AnonymousClass001.A0c("Need a PBEParameter spec with a PBE key.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                r1 = new AnonymousClass8QN(key.getEncoded());
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "inappropriate parameter type: ", algorithmParameterSpec);
                throw AnonymousClass6CA.A0Z(A0o.toString());
            }
            C834748n r52 = r1;
            if (r1 instanceof AnonymousClass8QP) {
                r52 = ((AnonymousClass8QP) r52).A00;
            }
            AnonymousClass8QN r53 = (AnonymousClass8QN) r52;
            if (algorithmParameterSpec instanceof AnonymousClass8U5) {
                AnonymousClass8U5 r8 = (AnonymousClass8U5) algorithmParameterSpec;
                r1 = new AnonymousClass8QK(r53, r8.getIV(), C161007oo.A02(r8.A01), r8.A00);
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                r1 = new AnonymousClass8QP(r53, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                byte[] bArr = r53.A00;
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                rC2ParameterSpec.getEffectiveKeyBits();
                r1 = new AnonymousClass8QP(new C177418ea(bArr), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec instanceof AnonymousClass8NC) {
                Map map = ((AnonymousClass8NC) algorithmParameterSpec).A00;
                Hashtable hashtable = new Hashtable();
                Iterator A0i = C18280x3.A0i(map);
                while (A0i.hasNext()) {
                    Object next = A0i.next();
                    hashtable.put(next, map.get(next));
                }
                C155827fZ r0 = new C155827fZ(hashtable);
                byte[] bArr2 = r53.A00;
                Hashtable hashtable2 = r0.A00;
                hashtable2.put(C18290x4.A0Z(), bArr2);
                r1 = new AnonymousClass8QO(hashtable2);
            } else if (algorithmParameterSpec == null) {
                r1 = new AnonymousClass8QN(key.getEncoded());
            } else {
                Class cls = A01;
                if (cls != null && AnonymousClass6C9.A1N(cls, algorithmParameterSpec)) {
                    try {
                        r1 = (AnonymousClass8QK) AccessController.doPrivileged(new AnonymousClass8N5(algorithmParameterSpec, r53));
                    } catch (Exception unused) {
                        throw AnonymousClass6CA.A0Z("Cannot process GCMParameterSpec.");
                    }
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A1T(A0o2, "unknown parameter type: ", algorithmParameterSpec);
                    throw AnonymousClass6CA.A0Z(A0o2.toString());
                }
            }
            try {
                this.A00.BFu(r1);
            } catch (Exception e) {
                throw AnonymousClass6CA.A0Z(AnonymousClass000.A0a("cannot initialize MAC: ", AnonymousClass001.A0o(), e));
            }
        } else {
            throw new InvalidKeyException("key is null");
        }
    }

    public void engineReset() {
        this.A00.reset();
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }

    public AnonymousClass8U3(C185978uY r1) {
        this.A00 = r1;
    }

    public void engineUpdate(byte b) {
        this.A00.BrT(b);
    }
}
