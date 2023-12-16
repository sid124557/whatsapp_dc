package X;

/* renamed from: X.5kk  reason: invalid class name and case insensitive filesystem */
public class C113015kk implements C185438te {
    public final /* synthetic */ C106735a4 A00;

    public C113015kk(C106735a4 r1) {
        this.A00 = r1;
    }

    public C06270Wx B8c() {
        return this.A00.A0s;
    }

    public int getCurrentPosition() {
        C106735a4 r6 = this.A00;
        long j = r6.A01;
        int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        long j2 = (long) r6.A00;
        if (i != 0) {
            j2 = (j2 + System.currentTimeMillis()) - j;
        }
        if (C86604Kt.A1Z(r6.A0s) && j2 > ((long) r6.A0J)) {
            r6.A0A(new C71273bq((Object) r6, 25));
        }
        return (int) j2;
    }

    public C06270Wx B9p() {
        return AnonymousClass4L0.A0O(C18290x4.A0Z());
    }

    public int getDuration() {
        return getCurrentPosition();
    }
}
