package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9TI  reason: invalid class name */
public class AnonymousClass9TI {
    public int A00 = 0;
    public AnonymousClass9T4 A01 = new AnonymousClass9T4(0, 0);
    public boolean A02;
    public final Camera.PreviewCallback A03 = new C205079qO(this, 0);
    public final Camera.PreviewCallback A04 = new C205079qO(this, 1);
    public final C194439Sw A05 = new C194439Sw();
    public final ArrayList A06 = AnonymousClass001.A0s();
    public final HashMap A07 = AnonymousClass001.A0t();

    public synchronized void A00() {
        synchronized (this) {
            this.A05.A00();
            this.A07.clear();
            this.A06.clear();
        }
    }

    public synchronized void A01(Camera camera) {
        if (!AnonymousClass9WU.A02()) {
            camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
            camera.setPreviewCallback((Camera.PreviewCallback) null);
            this.A02 = false;
        } else {
            throw AnonymousClass002.A0E("Cannot disable listeners on the UI thread");
        }
    }

    public synchronized void A02(Camera camera, AnonymousClass9T4 r12, int i) {
        RuntimeException th;
        int i2;
        synchronized (this) {
            if (AnonymousClass9WU.A02()) {
                th = AnonymousClass002.A0E("Cannot enable listeners on the UI thread");
                throw th;
            } else if (!this.A02) {
                this.A00 = i;
                if (r12 == null) {
                    r12 = new AnonymousClass9T4(0, 0);
                }
                this.A01 = r12;
                camera.getClass();
                HashMap hashMap = this.A07;
                if (!hashMap.isEmpty()) {
                    camera.setPreviewCallback((Camera.PreviewCallback) null);
                    AnonymousClass9T4 r6 = this.A01;
                    try {
                        Iterator A10 = C18290x4.A10(hashMap);
                        int i3 = 0;
                        int i4 = 0;
                        while (A10.hasNext()) {
                            int intValue = ((Integer) A10.next()).intValue();
                            if (intValue > i4) {
                                i4 = intValue;
                            }
                        }
                        if (i != 842094169) {
                            i2 = ImageFormat.getBitsPerPixel(i) * r6.A02 * r6.A01;
                            if (i2 % 8 != 0) {
                                throw AnonymousClass001.A0e("Total bits for Frame should be a multiple of 8");
                            }
                        } else {
                            int ceil = ((int) Math.ceil(((double) r6.A02) / 16.0d)) * 16;
                            int ceil2 = ((int) Math.ceil(((double) (ceil / 2)) / 16.0d)) * 16;
                            int i5 = r6.A01;
                            i2 = (ceil * i5) + (((ceil2 * i5) / 2) * 2);
                        }
                        int i6 = i2 / 8;
                        ArrayList arrayList = this.A06;
                        if (!arrayList.isEmpty()) {
                            if (((byte[]) arrayList.get(0)).length != i6) {
                                arrayList.clear();
                            }
                            int size = arrayList.size();
                            if (i4 > size) {
                                int i7 = i4 - size;
                                while (i3 < i7) {
                                    arrayList.add(new byte[i6]);
                                    i3++;
                                }
                            } else if (i4 < size) {
                                ArrayList A0I = AnonymousClass002.A0I(i4);
                                while (i3 < i4) {
                                    A0I.add((byte[]) arrayList.get(i3));
                                    i3++;
                                }
                                arrayList.clear();
                                arrayList.addAll(A0I);
                            }
                        } else {
                            while (i3 < i4) {
                                arrayList.add(new byte[i6]);
                                i3++;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            camera.addCallbackBuffer((byte[]) it.next());
                        }
                        camera.setPreviewCallbackWithBuffer(this.A04);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                    camera.setPreviewCallback(this.A03);
                }
                this.A02 = true;
            }
        }
    }
}
