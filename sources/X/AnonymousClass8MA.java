package X;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/* renamed from: X.8MA  reason: invalid class name */
public class AnonymousClass8MA implements Runnable {
    public final /* synthetic */ C1676481x A00;
    public final /* synthetic */ Path A01;

    public AnonymousClass8MA(C1676481x r1, Path path) {
        this.A00 = r1;
        this.A01 = path;
    }

    public void run() {
        try {
            Files.delete(this.A01);
        } catch (IOException unused) {
        }
    }
}
