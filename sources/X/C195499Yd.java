package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9Yd  reason: invalid class name and case insensitive filesystem */
public class C195499Yd implements C202269lf {
    public final /* synthetic */ AnonymousClass9RQ A00;
    public final /* synthetic */ AnonymousClass9SI A01;
    public final /* synthetic */ AnonymousClass9TF A02;
    public final /* synthetic */ C202259le A03;
    public final /* synthetic */ AnonymousClass32L A04;
    public final /* synthetic */ AtomicReference A05;
    public final /* synthetic */ AtomicReference A06;

    public C195499Yd(AnonymousClass9RQ r1, AnonymousClass9SI r2, AnonymousClass9TF r3, C202259le r4, AnonymousClass32L r5, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.A02 = r3;
        this.A05 = atomicReference;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = atomicReference2;
        this.A00 = r1;
    }

    public void BPV(Exception exc, List list, Map map) {
        AnonymousClass9KQ r0;
        AtomicReference atomicReference = this.A05;
        if (atomicReference.get() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C104855Sp r3 = this.A02.A04;
                AnonymousClass32L r2 = this.A04;
                C194579Tm r1 = new C194579Tm();
                r1.A00 = AnonymousClass9K2.METADATA_FETCH_FAILED;
                r1.A01 = "cancel due to other metadata requests failed";
                r3.A00((ARModelMetadataRequest) it.next(), r1.A00(), r2, false);
            }
        }
        Exception exc2 = exc;
        if (exc == null || !AnonymousClass0IR.A00((Object) null, exc2, atomicReference)) {
            CountDownLatch countDownLatch = new CountDownLatch(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it2.next();
                List<C195349Xk> list2 = (List) map.get(aRModelMetadataRequest.mCapability);
                if (list2 == null || list2.isEmpty()) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("metadata is missing from result. capability: %s version %d", aRModelMetadataRequest.mCapability, Integer.valueOf(aRModelMetadataRequest.mPreferredVersion));
                    C194579Tm r12 = new C194579Tm();
                    r12.A00 = AnonymousClass9K2.MODEL_METADATA_DOWNLOAD_FAILURE;
                    r12.A01 = formatStrLocaleSafe;
                    AnonymousClass9KQ A002 = r12.A00();
                    this.A02.A04.A00(aRModelMetadataRequest, A002, this.A04, false);
                    this.A03.BPO((AnonymousClass9SI) null, A002);
                    return;
                }
                AnonymousClass9TF r4 = this.A02;
                int size = list.size();
                AnonymousClass32L r32 = this.A04;
                AnonymousClass9SI r17 = this.A01;
                AtomicReference atomicReference2 = this.A06;
                AnonymousClass9RQ r11 = this.A00;
                AnonymousClass9RB r22 = new AnonymousClass9RB(aRModelMetadataRequest, this, countDownLatch);
                if (!r4.A05.containsKey(aRModelMetadataRequest.mCapability)) {
                    C194579Tm r33 = new C194579Tm();
                    r33.A00 = AnonymousClass9K2.METADATA_FETCH_FAILED;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Requested fetching unsupported capability: ");
                    r33.A01 = AnonymousClass000.A0R(aRModelMetadataRequest.mCapability, A0o);
                    r0 = r33.A00();
                } else {
                    ArrayList A0s = AnonymousClass001.A0s();
                    int A022 = ((C195349Xk) list2.get(0)).A02.A02();
                    for (C195349Xk r15 : list2) {
                        try {
                            if (!r4.A02(r15, aRModelMetadataRequest.mCapability)) {
                                A0s.add(r15);
                            }
                        } catch (AnonymousClass9KP e) {
                            C194579Tm r13 = new C194579Tm();
                            r13.A00 = AnonymousClass9K2.MODEL_FETCH_FAILURE;
                            r13.A03 = e;
                            r22.A00(r13.A00());
                        }
                    }
                    if (A0s.size() == 0) {
                        r4.A01(r17, aRModelMetadataRequest.mCapability, A022);
                        if (r11 != null) {
                            atomicReference2.set(Double.valueOf(C1899593h.A00(atomicReference2) + (1.0d / ((double) size))));
                            r11.A00(C1899593h.A00(atomicReference2));
                        }
                        C104855Sp r42 = r4.A04;
                        if (!r42.A02(r32)) {
                            r42.A02.A05(aRModelMetadataRequest, r32, A022, true);
                        }
                        r0 = null;
                    } else {
                        C104855Sp r152 = r4.A04;
                        if (!r152.A02(r32)) {
                            r152.A02.A05(aRModelMetadataRequest, r32, A022, false);
                        }
                        C1903195h r19 = new C1903195h(r11, r4, atomicReference2, new AtomicReference(AnonymousClass6C8.A0Z()), size);
                        r4.A00.A04(r19, new AnonymousClass9YV(aRModelMetadataRequest, r17, r22, r4, list2), new C192529Kl(), r32, A0s);
                    }
                }
                r22.A00(r0);
            }
            try {
                countDownLatch.await();
                if (atomicReference.get() != null) {
                    this.A03.BPO((AnonymousClass9SI) null, (Exception) atomicReference.get());
                } else {
                    this.A03.BPO(this.A01, (Exception) null);
                }
            } catch (InterruptedException e2) {
                C194579Tm r14 = new C194579Tm();
                r14.A00 = AnonymousClass9K2.MODEL_FETCH_FAILURE;
                r14.A03 = e2;
                this.A03.BPO((AnonymousClass9SI) null, r14.A00());
            }
        } else {
            C194579Tm r16 = new C194579Tm();
            r16.A00 = AnonymousClass9K2.MODEL_METADATA_DOWNLOAD_FAILURE;
            r16.A03 = exc2;
            AnonymousClass9KQ A003 = r16.A00();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                this.A02.A04.A00((ARModelMetadataRequest) it3.next(), A003, this.A04, false);
            }
            this.A03.BPO((AnonymousClass9SI) null, A003);
        }
    }
}
