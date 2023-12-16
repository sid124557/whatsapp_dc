package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* renamed from: X.93s  reason: invalid class name and case insensitive filesystem */
public class C1900693s extends CameraDevice.StateCallback implements C202909mo {
    public CameraDevice A00;
    public C201699ka A01;
    public Boolean A02;
    public final C192979Mm A03;
    public final C192989Mn A04;
    public final AnonymousClass9T9 A05;

    public void Ay4() {
        this.A05.A00();
    }

    public /* bridge */ /* synthetic */ Object BCH() {
        Boolean bool = this.A02;
        if (bool == null) {
            throw AnonymousClass001.A0e("Open Camera operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            CameraDevice cameraDevice = this.A00;
            cameraDevice.getClass();
            return cameraDevice;
        } else {
            throw this.A01;
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A02 = Boolean.FALSE;
            this.A01 = new C201699ka("Could not open camera. Operation disconnected.");
            this.A05.A01();
            return;
        }
        C192989Mn r0 = this.A04;
        if (r0 != null) {
            AnonymousClass9ZS r6 = r0.A00;
            List list = r6.A0b.A00;
            UUID uuid = r6.A0e.A03;
            r6.A0f.A05(new C201189jf(new C201689kZ(2, "Camera has been disconnected."), r6, list, uuid), uuid);
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        String str;
        int i2;
        if (this.A00 == null) {
            this.A02 = Boolean.FALSE;
            this.A01 = new C201699ka(AnonymousClass000.A0Y("Could not open camera. Operation error: ", AnonymousClass001.A0o(), i));
            this.A05.A01();
            return;
        }
        C192989Mn r0 = this.A04;
        if (r0 != null) {
            AnonymousClass9ZS r6 = r0.A00;
            if (i == 1) {
                str = "Camera in use by higher priority component.";
            } else if (i == 2) {
                str = "There are too many open camera devices.";
            } else if (i == 3) {
                str = "Camera disabled, device policy error.";
            } else if (i == 4 || i == 5) {
                i2 = 100;
                str = "Camera device has encountered a fatal error.";
                List list = r6.A0b.A00;
                UUID uuid = r6.A0e.A03;
                r6.A0f.A05(new C201189jf(new C201689kZ(i2, str), r6, list, uuid), uuid);
            } else {
                str = "Unknown camera error.";
            }
            i2 = 1;
            List list2 = r6.A0b.A00;
            UUID uuid2 = r6.A0e.A03;
            r6.A0f.A05(new C201189jf(new C201689kZ(i2, str), r6, list2, uuid2), uuid2);
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        this.A02 = Boolean.TRUE;
        this.A00 = cameraDevice;
        this.A05.A01();
    }

    public C1900693s(C192979Mm r4, C192989Mn r5) {
        this.A03 = r4;
        this.A04 = r5;
        AnonymousClass9T9 r2 = new AnonymousClass9T9();
        this.A05 = r2;
        r2.A02(0);
    }

    public void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        C192979Mm r6 = this.A03;
        if (r6 != null) {
            AnonymousClass9ZS r5 = r6.A00;
            if (r5.A0j == cameraDevice) {
                r5.A0q = false;
                r5.A0j = null;
                r5.A0E = null;
                r5.A0A = null;
                r5.A0B = null;
                r5.A05 = null;
                AnonymousClass9WO r2 = r5.A09;
                if (r2 != null) {
                    r2.A0E.removeMessages(1);
                    r2.A08 = null;
                    r2.A06 = null;
                    r2.A07 = null;
                    r2.A05 = null;
                    r2.A04 = null;
                    r2.A0A = null;
                    r2.A0D = null;
                    r2.A0C = null;
                }
                r5.A0Y.A0F = false;
                r5.A0X.A00();
                if (r5.A0a.A0D && !r5.A0s) {
                    try {
                        r5.A0f.A00(new C203849oP(r6, 6), "on_camera_closed_stop_video_recording", new C204469pP((Object) r6, 7)).get();
                    } catch (InterruptedException | ExecutionException unused) {
                        AnonymousClass9WT.A00();
                    }
                }
                AnonymousClass9WQ r3 = r5.A0Z;
                if (r3.A08 != null) {
                    synchronized (AnonymousClass9WQ.A0S) {
                        AnonymousClass9ZW r1 = r3.A07;
                        if (r1 != null) {
                            r1.A0H = false;
                            r3.A07 = null;
                        }
                    }
                    try {
                        r3.A08.Avz();
                        r3.A08.close();
                    } catch (Exception unused2) {
                    }
                    r3.A08 = null;
                }
                String id = cameraDevice.getId();
                AnonymousClass96o r12 = r5.A0V;
                if (id.equals(r12.A00)) {
                    r12.A01();
                    r12.A00 = null;
                }
            }
        }
    }
}
