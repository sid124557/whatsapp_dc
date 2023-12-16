package X;

import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.Jid;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4JN  reason: invalid class name */
public class AnonymousClass4JN implements AnonymousClass4AC {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public AnonymousClass4JN(Object obj, Object obj2, String str, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = i;
        this.A02 = obj2;
    }

    public final void BLI(C41572Kt r8, Short sh, String str, boolean z) {
        if (this.A04 != 0) {
            C56162rW r6 = (C56162rW) this.A01;
            String str2 = this.A03;
            int i = this.A00;
            AnonymousClass4GR r3 = (AnonymousClass4GR) this.A02;
            if (z) {
                C56672sN.A00(r6.A05, str2.hashCode());
            } else {
                r6.A05.A09(Integer.valueOf(str2.hashCode()), "metadata_network_end");
                r6.A06.A0E(Integer.valueOf(i), sh);
            }
            if (r8 != null) {
                List<C53832nk> list = r8.A01;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (C53832nk r0 : list) {
                        if (C162457s7.A0P(r0.A03, str2)) {
                            r3.invoke(Boolean.TRUE, (Object) null);
                            return;
                        }
                    }
                }
                str = "extensions-integrity-check-failed";
            }
            r3.invoke(Boolean.FALSE, str);
            return;
        }
        WaFlowsViewModel waFlowsViewModel = (WaFlowsViewModel) this.A01;
        String str3 = this.A03;
        int i2 = this.A00;
        Jid jid = (Jid) this.A02;
        C23651Ud r1 = waFlowsViewModel.A0F;
        r1.A0D(i2, "unknown_extension");
        r1.A0E(Integer.valueOf(i2), sh);
        if (r8 != null) {
            for (C53832nk r12 : r8.A01) {
                if (C162457s7.A0P(r12.A03, str3)) {
                    waFlowsViewModel.A0I.BkM(new C117715sN(waFlowsViewModel, jid, r12.A00, 45));
                    return;
                }
            }
            str = "extensions-invalid-extensions-id";
            waFlowsViewModel.A09.A02(waFlowsViewModel.A08.A0H(), jid.user, str3);
        }
        waFlowsViewModel.A05.A0G(str);
    }
}
