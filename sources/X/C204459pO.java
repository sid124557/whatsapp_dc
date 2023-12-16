package X;

import android.hardware.Camera;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9pO  reason: invalid class name and case insensitive filesystem */
public class C204459pO implements Callable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C204459pO(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A05 = i3;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i;
        this.A04 = obj3;
        this.A00 = i2;
    }

    public final Object call() {
        AnonymousClass96t r0;
        if (this.A05 != 0) {
            AnonymousClass9WT.A00();
            AnonymousClass9ZS r6 = (AnonymousClass9ZS) this.A02;
            if (!(r6.A0k == null || r6.A0k == ((AnonymousClass9SV) this.A03).A02)) {
                r6.A0k.A02();
            }
            AnonymousClass9SV r1 = (AnonymousClass9SV) this.A03;
            r6.A0k = r1.A02;
            r6.A0C = null;
            r6.A0C = C203559nw.A00;
            r6.A07 = r1;
            C203589nz r3 = (C203589nz) this.A04;
            r6.A0D = r3;
            Map map = (Map) r3.B3x(C203589nz.A02);
            if (!map.isEmpty()) {
                C194609Ts r12 = r6.A0W;
                if (!map.isEmpty()) {
                    r12.A00 = map;
                    if (r12.A04.A09()) {
                        r12.A05();
                    }
                }
            }
            r6.A01 = this.A00;
            r6.A0L = C1899593h.A1V(C203589nz.A0E, r3);
            C194609Ts r2 = r6.A0W;
            int i = this.A01;
            if (r2.A04.A09()) {
                r2.A04();
                int i2 = 1;
                if (i == 1) {
                    i2 = 0;
                }
                if (!r2.A07(i2)) {
                    if (r2.A05 == null) {
                        throw AnonymousClass002.A0E("Logical cameras not initialised!");
                    } else if (r2.A05.length == 0) {
                        throw new AnonymousClass96j();
                    } else if (i != 0 || !r2.A07(0)) {
                        if (i != 1 || !r2.A07(1)) {
                            StringBuilder sb = new StringBuilder("Camera 2 API - Could not get CameraInfo for CameraFacing id: ");
                            sb.append(i);
                            sb.append(" Number Of Cameras: ");
                            sb.append(C194609Ts.A06);
                            sb.append(" BACK: ");
                            boolean z = C194609Ts.A07;
                            sb.append(z);
                            sb.append(" FRONT: ");
                            sb.append(z);
                            C193439Oq[] r22 = r2.A05;
                            if (r22 != null) {
                                sb.append(" Camera Info size: ");
                                sb.append(r1);
                                sb.append(" Camera lenses: ");
                                for (C193439Oq r02 : r22) {
                                    sb.append(r02.A01);
                                    sb.append(" ");
                                }
                            } else {
                                sb.append(" Camera Info NULL");
                            }
                            throw AnonymousClass6C7.A0e(sb);
                        }
                        AnonymousClass9WT.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                        i = 0;
                    } else {
                        AnonymousClass9WT.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                        i = 1;
                    }
                }
                r6.A09 = new AnonymousClass9WO();
                String A032 = r2.A03(i);
                try {
                    AnonymousClass9ZS.A01(r6, A032);
                    AnonymousClass9ZS.A02(r6, A032);
                    AnonymousClass9ZS.A00(r6);
                    r6.A06(A032, (Float) null);
                    int i3 = r6.A00;
                    C194899Ux B5H = r6.B5H();
                    if (!r6.isConnected() || (r0 = r6.A0A) == null) {
                        throw new C201659kW("Cannot get camera settings");
                    }
                    C193479Ou r03 = new C193479Ou(new C193469Ot(B5H, r0, i3));
                    AnonymousClass9WT.A00();
                    return r03;
                } catch (Exception e) {
                    AnonymousClass9WT.A00();
                    r6.B1n((AnonymousClass9SG) null);
                    throw e;
                }
            } else {
                throw AnonymousClass002.A0E("Cannot resolve camera facing, not on the Optic thread");
            }
        } else {
            AnonymousClass9ZR r32 = (AnonymousClass9ZR) this.A02;
            AnonymousClass9SV r62 = (AnonymousClass9SV) this.A03;
            int i4 = this.A01;
            C203589nz r5 = (C203589nz) this.A04;
            int i5 = this.A00;
            try {
                AnonymousClass9WT.A00();
                if (!(r32.A0a == null || r32.A0a == r62.A02)) {
                    r32.A0a.A02();
                    r32.A0a = null;
                }
                C194919Vb r8 = r32.A0J;
                C194959Vh r7 = r8.A02;
                if (r7.A09()) {
                    if (r8.A02(i4) == -1) {
                        int i6 = C194919Vb.A03;
                        if (i6 == -1) {
                            if (r8.A05()) {
                                i6 = C194919Vb.A03;
                            } else {
                                r7.A06("Number of cameras must be loaded on background thread.");
                                i6 = Camera.getNumberOfCameras();
                                C194919Vb.A03 = i6;
                            }
                        }
                        if (i6 > 0) {
                            if (i4 == 0) {
                                if (r8.A06(1)) {
                                    AnonymousClass9WT.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                    i4 = 1;
                                }
                            } else if (r8.A06(0)) {
                                AnonymousClass9WT.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                i4 = 0;
                            }
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("found ");
                            A0o.append(C194919Vb.A03);
                            A0o.append(" cameras with bad facing constants");
                            throw AnonymousClass6C7.A0e(A0o);
                        }
                        throw new AnonymousClass96j();
                    }
                    r32.A0A(r5, i4);
                    C193479Ou A012 = r32.A01(r62, r5, i5);
                    AnonymousClass9WT.A00();
                    return A012;
                }
                throw AnonymousClass002.A0E("Cannot resolve camera facing, not on the Optic thread");
            } catch (Exception e2) {
                AnonymousClass9WT.A00();
                C193809Qd r13 = r32.A0N;
                AtomicReference atomicReference = r13.A00;
                C1899593h.A1U(atomicReference);
                C1899593h.A1U(atomicReference);
                r13.A00(0);
                AnonymousClass9RS r14 = r32.A0L;
                r14.A01.A00();
                r14.A02.A00();
                r32.BmJ((C202329lq) null);
                r32.A0O.A06.A00();
                r32.A0R.A00();
                r32.A04();
                throw e2;
            }
        }
    }
}
