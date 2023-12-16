package X;

import com.whatsapp.funstickers.report.bloks.WaBkFunReportInterpreterExtImpl$onReportSubmitted$1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1Ly  reason: invalid class name and case insensitive filesystem */
public class C22291Ly extends AnonymousClass3CG {
    public AnonymousClass2OB A00;

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r8, C146787Bp r9, C151147Tp r10) {
        if (r9.A00.equals("wa.action.genai.stickers.ReportSubmitted")) {
            List list = r8.A00;
            String A0n = AnonymousClass001.A0n(list, 0);
            String A0s = C18290x4.A0s(list);
            AnonymousClass2OB r3 = this.A00;
            Log.i("WaBkFunReportInterpreterExtImpl/onReportSubmitted");
            if (!(A0n == null || A0s == null)) {
                C616131n.A02((C85494Gl) null, new WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(r3, A0n, A0s, (C84814Du) null), r3.A02, (AnonymousClass20D) null, 3);
            }
        }
        return null;
    }

    public C22291Ly(AnonymousClass2OB r2) {
        super("wa.action.genai.stickers.ReportSubmitted");
        this.A00 = r2;
    }
}
