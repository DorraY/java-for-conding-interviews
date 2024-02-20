package basics;

public class FirstBadVersion {

    int numberOfVersions;

    FirstBadVersion(int numberOfVersions) {
        this.numberOfVersions  = numberOfVersions;
    }

    int firstBadSolution(int n) {
        int left = 1;
        int right = n;

        while (left<right) {
            int mid = (left -right)/2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid +1;
            }
        }
        return 0;


    }

    boolean isBadVersion(int n) {
        return n % 2 == 0;
    }

}
