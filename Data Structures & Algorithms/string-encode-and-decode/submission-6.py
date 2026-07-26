class Solution:

    def encode(self, strs: List[str]) -> str:
        output = ""
        for s in strs:
            output += "\:" + s + ":/"
        print(output)
        return output

    def decode(self, s: str) -> List[str]:
        output = []
        tmp = ""
        in_word = False
        for i in range(1, len(s) - 1):
            if s[i-1] == "\\" and s[i] == ":":
                in_word = True
                tmp = ""
            elif s[i] == ":" and s[i+1] == "/":
                output.append(tmp)
                tmp = ""
            elif in_word == True:
                tmp += s[i]
            else:
                continue
        return output