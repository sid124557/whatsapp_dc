package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.85C  reason: invalid class name */
public class AnonymousClass85C implements C186538vW {
    public final Handler A00;
    public final CopyOnWriteArraySet A01;

    public void BQi(long j, String str, boolean z) {
        this.A00.post(new AnonymousClass8MM(this, str, 0, j, z));
    }

    public void BfR(float f, int i, int i2, int i3) {
        this.A00.post(new AnonymousClass8MO(this, f, i2, i3, i, 1));
    }

    public static Iterator A00(Object obj) {
        return ((AnonymousClass85C) obj).A01.iterator();
    }

    public void BRg() {
        C172668Mf.A00(this.A00, this, 12);
    }

    public void BSU(C160117n4 r3, String str, String str2, String str3, long j) {
        this.A00.post(new AnonymousClass8MP(this, r3, str, str2, str3, j));
    }

    public void BVD(boolean z) {
        this.A00.post(new C71703cX(1, (Object) this, z));
    }

    public void BWz(byte[] bArr) {
        AnonymousClass8MF.A00(this.A00, this, bArr, 21);
    }

    public void BYB() {
        C172668Mf.A00(this.A00, this, 16);
    }

    public void BYD(C147697Fh r3, C160117n4 r4, C166427yf r5, C166537yr r6, String str, String str2) {
        this.A00.post(new AnonymousClass8MQ(this, r3, r4, r5, r6, str, str2));
    }

    public void BYG(C166537yr r3, float f, long j) {
        this.A00.post(new AnonymousClass8MI(this, r3, f, j));
    }

    public void BYm(C166537yr r4, String str) {
        this.A00.post(new C117715sN(this, r4, str, 0));
    }

    public void BYo() {
        C172668Mf.A00(this.A00, this, 15);
    }

    public void Bb5(long j) {
        this.A00.post(new C70083Zv(this, j, 1));
    }

    public void BcA(C166427yf r3, C166537yr r4, String str, long j, boolean z, boolean z2) {
        this.A00.post(new AnonymousClass8MR(this, r3, r4, str, j, z, z2));
    }

    public void Bco(long j, long j2, boolean z, boolean z2) {
        this.A00.post(new AnonymousClass8MN(this, j, j2, z, z2));
    }

    public void Bct(C147697Fh r3) {
        AnonymousClass8MF.A00(this.A00, this, r3, 18);
    }

    public void Bcu(boolean z) {
        this.A00.post(new C71703cX(0, (Object) this, z));
    }

    public void BeA(List list) {
        AnonymousClass8MF.A00(this.A00, this, list, 20);
    }

    public void BfE(C166427yf r3, C166537yr r4, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A00.post(new AnonymousClass8MX(this, r3, r4, str, str2, str3, str4, j, z));
    }

    public void BfG(C147697Fh r3, C142486xH r4, C166427yf r5, C166537yr r6, String str, boolean z, boolean z2) {
        this.A00.post(new AnonymousClass8MW(this, r3, r4, r5, r6, str, z, z2));
    }

    public void BfL(String str, String str2) {
        this.A00.post(new C70313aI(this, str, str2, 0));
    }

    public void BfO(C147697Fh r3, C142486xH r4, C166427yf r5, C166537yr r6, String str, String str2, String str3, long j, long j2, boolean z) {
        this.A00.post(new C172618Ma(this, r3, r4, r5, r6, str, str2, str3, j, j2, z));
    }

    public void BfP() {
        C172668Mf.A00(this.A00, this, 13);
    }

    public void BfQ() {
        C172668Mf.A00(this.A00, this, 14);
    }

    public void BfT(C166427yf r3, C166537yr r4, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        this.A00.post(new AnonymousClass8MZ(this, r3, r4, str, str2, str3, str4, str5, j, z, z2));
    }

    public void Bfb(boolean z, boolean z2) {
        this.A00.post(new C71393c2(this, 0, z, z2));
    }

    public void Bfg(C160117n4 r3) {
        AnonymousClass8MF.A00(this.A00, this, r3, 19);
    }

    public AnonymousClass85C(Handler handler, C186538vW r3) {
        this.A00 = handler;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A01 = copyOnWriteArraySet;
        copyOnWriteArraySet.add(r3);
    }
}
