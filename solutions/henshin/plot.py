import matplotlib.pyplot as plt
import pandas as pd
import sys

if len(sys.argv) < 2:
    print("USAGE: python plot.py <RESULTS_CSV_FILE>")
    sys.exit(0)

filename = sys.argv[1]

df = pd.read_csv(filename, sep=";")

fig, ax = plt.subplots(figsize=(8, 4))

ax.set_ylabel('Runtime (ms)')
ax.set_xlabel('No. of Repetitions')
ax.set_title('Total Transformation Runtime')

plt.plot (df.values[:, 0], df.values[:, 1] / 1000000.0)

plt.savefig("runtime.pdf")
