package X;

import android.os.ConditionVariable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.3f6  reason: invalid class name and case insensitive filesystem */
public class C73203f6 extends Thread {
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final /* synthetic */ C53752nb A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73203f6(C53752nb r3) {
        super("ReadyJobsProducer");
        this.A01 = r3;
    }

    public void run() {
        boolean z;
        Job job;
        while (true) {
            ConditionVariable conditionVariable = this.A00;
            conditionVariable.block();
            conditionVariable.close();
            C53752nb r5 = this.A01;
            synchronized (r5) {
                LinkedList linkedList = r5.A01;
                z = false;
                job = null;
                if (!linkedList.isEmpty()) {
                    ListIterator listIterator = linkedList.listIterator();
                    HashMap A0t = AnonymousClass001.A0t();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        Job job2 = (Job) listIterator.next();
                        String str = job2.parameters.groupId;
                        if ((str == null || !r5.A03.contains(str)) && job2.A03()) {
                            if (r5.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && A0t.containsKey(job2.parameters.groupId)) {
                                Job job3 = (Job) A0t.get(job2.parameters.groupId);
                                if (job3.A03()) {
                                    C146907Cb r0 = r5.A00;
                                    if (r0 != null) {
                                        r0.A00.A01.A0A("JobQueue/DeterministicJobSelection/Fixed", false, (String) null);
                                    }
                                    while (listIterator.hasPrevious() && listIterator.previous() != job3) {
                                    }
                                    A0t.remove(job2.parameters.groupId);
                                    job2 = job3;
                                } else {
                                    C146907Cb r02 = r5.A00;
                                    if (r02 != null) {
                                        r02.A00.A01.A0A("JobQueue/DeterministicJobSelection/Broken", false, (String) null);
                                    }
                                }
                            }
                            listIterator.remove();
                            String str2 = job2.parameters.groupId;
                            if (str2 != null) {
                                r5.A03.add(str2);
                                int A002 = r5.A00(str2);
                                if (A002 != 0) {
                                    if (A002 == 1) {
                                        r5.A02.remove(str2);
                                    } else {
                                        C18280x3.A1D(str2, r5.A02, A002 - 1);
                                    }
                                }
                            }
                            if (!r5.A04.offer(job2)) {
                                z = listIterator.hasNext();
                                job = job2;
                                break;
                            }
                        } else if (r5.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && !A0t.containsKey(job2.parameters.groupId)) {
                            A0t.put(job2.parameters.groupId, job2);
                        }
                    }
                }
            }
            if (job != null) {
                if (z) {
                    conditionVariable.open();
                }
                try {
                    r5.A04.put(job);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
