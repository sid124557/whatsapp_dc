package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.85j  reason: invalid class name and case insensitive filesystem */
public class C1684285j implements C183838qk {
    public MediaFormat A00;
    public C1683385a A01 = null;
    public ArrayList A02;
    public CountDownLatch A03 = new CountDownLatch(1);
    public LinkedBlockingQueue A04;
    public LinkedBlockingQueue A05 = new LinkedBlockingQueue();
    public LinkedBlockingQueue A06 = new LinkedBlockingQueue();
    public volatile boolean A07;
    public volatile boolean A08 = true;

    public C186218uw B0Z() {
        this.A04 = new LinkedBlockingQueue();
        return new C1683785e(this);
    }

    public C186408vG B0b() {
        return new C1683985g(this);
    }
}
