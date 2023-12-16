package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0N4  reason: invalid class name */
public class AnonymousClass0N4 {
    public List A00 = AnonymousClass001.A0s();

    public void A00(Path path) {
        List list = this.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C09200fo r1 = (C09200fo) list.get(size);
                if (r1 != null && !r1.A06) {
                    AnonymousClass0Y0.A03(path, ((C01540Bg) r1.A02).A0G() / 100.0f, ((C01540Bg) r1.A00).A0G() / 100.0f, ((C01540Bg) r1.A01).A0G() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
